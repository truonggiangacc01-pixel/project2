package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Spectator;
import project2.repository.SpectatorRepo;

@Service
public class SpectatorService {

    @Autowired
    private SpectatorRepo spectatorRepo;

    public void saveSpectator(Spectator spectator) {
        spectatorRepo.save(spectator);
    }
}