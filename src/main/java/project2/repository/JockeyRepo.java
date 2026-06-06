package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.Jockey;

import java.util.Optional;

public interface JockeyRepo extends JpaRepository<Jockey, Integer> {

    boolean existsByEmail(String email);
}
