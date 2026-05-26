package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import project2.entity.Horse;

public interface HorseRepo extends JpaRepository<Horse, Integer> {
}
