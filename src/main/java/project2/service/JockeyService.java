package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Jockey;
import project2.repository.JockeyRepo;

@Service
public class JockeyService {

    @Autowired
    private JockeyRepo jockeyRepo;

    public void saveJockey(Jockey jockey) {
        jockeyRepo.save(jockey);
    }
}