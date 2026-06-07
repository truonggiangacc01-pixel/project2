package project2.service;

import io.jsonwebtoken.Jwt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project2.dto.request.LoginRequest;
import project2.dto.response.LoginResponse;
import project2.entity.Jockey;
import project2.entity.RaceReferee;
import project2.entity.Spectator;
import project2.repository.*;

@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final AdminRepo adminRepo;
    private final HorseOwnerRepo horseOwnerRepo;
    private final JockeyRepo jockeyRepo;
    private final RaceRefereeRepo raceRefereeRepo;
    private final SpectatorRepo spectatorRepo;
    private final JwtService jwtService;

    public AuthService(PasswordEncoder passwordEncoder, AdminRepo adminRepo, HorseOwnerRepo horseOwnerRepo, JockeyRepo jockeyRepo, RaceRefereeRepo raceRefereeRepo, SpectatorRepo spectatorRepo, JwtService jwtService) {
        this.passwordEncoder = passwordEncoder;
        this.adminRepo = adminRepo;
        this.horseOwnerRepo = horseOwnerRepo;
        this.jockeyRepo = jockeyRepo;
        this.raceRefereeRepo = raceRefereeRepo;
        this.spectatorRepo = spectatorRepo;
        this.jwtService = jwtService;
    }

    public LoginResponse authenticate(LoginRequest request) {
        String rawPassword = request.getPassword();
        String encodedPasswordInDb = null;
        String userRoleStr = request.getRole().name();

        // 1. Phân luồng tìm kiếm user dựa trên Role được truyền lên
        switch (request.getRole()) {

            case ADMIN:
                var admin = adminRepo.findByEmail(request.getEmail())
                        .orElseThrow(() -> new RuntimeException("Tài khoản không tồn tại!"));
                encodedPasswordInDb = admin.getPassword();
                break;

            case SPECTATOR:
                var spectator = spectatorRepo.findByEmail(request.getEmail())
                        .orElseThrow(() -> new RuntimeException("Tài khoản không tồn tại!"));
                encodedPasswordInDb = spectator.getPassword();
                break;

            case HORSE_OWNER:
                var horseOwner = horseOwnerRepo.findByEmail(request.getEmail())
                        .orElseThrow(() -> new RuntimeException("Tài khoản không tồn tại!"));
                encodedPasswordInDb = horseOwner.getPassword();
                break;

            case JOCKEY:
                var jockey = jockeyRepo.findByEmail(request.getEmail())
                        .orElseThrow(() -> new RuntimeException("Tài khoản không tồn tại!"));
                encodedPasswordInDb = jockey.getPassword();
                break;

            case RACE_REFEREE:
                var referee = raceRefereeRepo.findByEmail(request.getEmail())
                        .orElseThrow(() -> new RuntimeException("Tài khoản không tồn tại!"));
                encodedPasswordInDb = referee.getPassword();
                break;

            default:
                throw new RuntimeException("Vai trò đăng nhập không hợp lệ!");
        }

        // 2. So sánh mật khẩu (Đáp ứng FK-04, BR-28: Không so sánh plain text)
        if (!passwordEncoder.matches(rawPassword, encodedPasswordInDb)) {
            throw new RuntimeException("Thông tin đăng nhập không chính xác!");
        }

        // 3. Tạo JWT Token thực tế
        String token = jwtService.generateToken(request.getEmail(), userRoleStr);

        // 4. Trả về thông tin cho Controller
        return new LoginResponse(token, userRoleStr, "Đăng nhập thành công!");
    }
}
