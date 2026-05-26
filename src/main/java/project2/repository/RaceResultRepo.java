package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.RaceResult;

public interface RaceResultRepo extends JpaRepository<RaceResult, Integer> {
}
