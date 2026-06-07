package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project2.entity.Admin;
import project2.entity.RaceReferee;

import java.util.Optional;

public interface RaceRefereeRepo extends JpaRepository<RaceReferee, Integer> {

    boolean existsByEmail(String email);

    Optional<Admin> findByEmail(String email);
}
