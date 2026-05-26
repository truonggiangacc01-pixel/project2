package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.RaceParticipation;
import project2.repository.RaceParticipationRepo;

@Service
public class RaceParticipationService {

    @Autowired
    private RaceParticipationRepo raceParticipationRepo;

    public void saveRaceParticipation(RaceParticipation raceParticipation) {
        raceParticipationRepo.save(raceParticipation);
    }
}