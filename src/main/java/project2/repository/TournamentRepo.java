package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.Tournament;

public interface TournamentRepo extends JpaRepository<Tournament, Integer> {
}
