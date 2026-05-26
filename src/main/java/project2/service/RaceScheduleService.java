package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.RaceSchedule;
import project2.repository.RaceScheduleRepo;

@Service
public class RaceScheduleService {

    @Autowired
    private RaceScheduleRepo raceScheduleRepo;

    public void saveRaceSchedule(RaceSchedule raceSchedule) {
        raceScheduleRepo.save(raceSchedule);
    }
}