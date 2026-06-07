package project2.service;

import org.springframework.beans.factory.BeanRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project2.entity.*;
import project2.exception.EmailAlreadyExistsException;
import project2.repository.*;

@Service
public class RegistrationService {

    @Autowired
    private SpectatorRepo spectatorRepo;

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private HorseOwnerRepo horseOwnerRepo;

    @Autowired
    private JockeyRepo jockeyRepo;

    @Autowired
    private RaceRefereeRepo raceRefereeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean isEmailExistsInSystem(String email){
        return
                spectatorRepo.existsByEmail(email)
                || horseOwnerRepo.existsByEmail(email)
                || jockeyRepo.existsByEmail(email)
                || adminRepo.existsByEmail(email)
                || raceRefereeRepo.existsByEmail(email);
    }

    public void checkEmailUnique(String email){
        if(isEmailExistsInSystem(email)){
            throw new EmailAlreadyExistsException("Email already exists");
        }
    }

    public Spectator registerSpectator(String userName, String email, String password){
        checkEmailUnique(email);
        // 2. Bọc passwordEncoder.encode() quanh tham số password
        Spectator spectator = new Spectator(userName, email, passwordEncoder.encode(password));
        return spectatorRepo.save(spectator);
    }

    public HorseOwner registerHorseOwner(String fullName, String userName, String phone, String email, String password){
        checkEmailUnique(email);
        HorseOwner horseOwner = new HorseOwner(fullName, userName, phone, passwordEncoder.encode(password), email);
        return horseOwnerRepo.save(horseOwner);
    }

    public Jockey registerJockey(String fullName, String userName, Integer age, Integer experienceYears, String phone, String password, String email){
        checkEmailUnique(email);
        Jockey jockey = new Jockey(fullName, userName, age, experienceYears, phone, passwordEncoder.encode(password), email);
        return jockeyRepo.save(jockey);
    }

    public RaceReferee registerRaceReferee(String fullName, String userName, String phone, String email, String password){
        checkEmailUnique(email);
        RaceReferee raceReferee = new RaceReferee(fullName, userName, phone, passwordEncoder.encode(password), email);
        return raceRefereeRepo.save(raceReferee);
    }


}
