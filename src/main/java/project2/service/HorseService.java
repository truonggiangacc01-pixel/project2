package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Horse;
import project2.repository.HorseRepo;

@Service
public class HorseService {

    @Autowired
    private HorseRepo horseRepo;

    public void saveHorse(Horse horse) {
        horseRepo.save(horse);
    }
}