package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.Prediction;

public interface PredictionRepo extends JpaRepository<Prediction, Integer> {
}
