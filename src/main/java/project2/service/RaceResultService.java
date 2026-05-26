package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.RaceResult;
import project2.repository.RaceResultRepo;

@Service
public class RaceResultService {

    @Autowired
    private RaceResultRepo raceResultRepo;

    public void saveRaceResult(RaceResult raceResult) {
        raceResultRepo.save(raceResult);
    }
}