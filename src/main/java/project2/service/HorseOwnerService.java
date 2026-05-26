package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.HorseOwner;
import project2.repository.HorseOwnerRepo;

@Service
public class HorseOwnerService {

    @Autowired
    private HorseOwnerRepo horseOwnerRepo;

    public void saveHorseOwner(HorseOwner horseOwner) {
        horseOwnerRepo.save(horseOwner);
    }
}