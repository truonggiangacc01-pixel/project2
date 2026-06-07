package project2.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    // Khóa bí mật dùng để ký Token (Trong thực tế nên cấu hình ở application.properties)
    // Cần một chuỗi đủ dài để thuật toán HS256 hoạt động an toàn
    private static  final String SECRET_KEY_STRING = "DayLaMotKhoaBiMatCucKyDaiVaAnToanChoDuAnDuaNguaCuaBan123456789";

    // Key được mã hóa từ chuỗi bí mật
    private final Key key = Keys.hmacShaKeyFor(SECRET_KEY_STRING.getBytes());

    // Thời gian sống của Token (Ví dụ: 24 giờ)
    private static final long EXPIRATION_TIME = 86400000L;

    public String generateToken(String email, String role) {
        return Jwts.builder()
                .setSubject(email) // Lưu email làm chủ thể của token
                .claim("role", role) // Nhúng thêm Role vào trong token (Đáp ứng NFR-72)
                .setIssuedAt(new Date(System.currentTimeMillis())) // Thời gian tạo
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // Thời gian hết hạn
                .signWith(key, SignatureAlgorithm.HS256) // Ký bằng thuật toán HS256
                .compact();
    }
}
