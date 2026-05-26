package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.RaceReferee;
import project2.repository.RaceRefereeRepo;

@Service
public class RaceRefereeService {

    @Autowired
    private RaceRefereeRepo raceRefereeRepo;

    public void saveRaceReferee(RaceReferee raceReferee) {
        raceRefereeRepo.save(raceReferee);
    }
}