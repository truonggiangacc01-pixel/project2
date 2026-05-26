package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.RaceSchedule;

public interface RaceScheduleRepo extends JpaRepository<RaceSchedule, Integer> {
}
