package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.Prize;

public interface PrizeRepo extends JpaRepository<Prize, Integer> {
}
