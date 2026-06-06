package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project2.entity.HorseOwner;

import java.util.Optional;

public interface HorseOwnerRepo extends JpaRepository<HorseOwner, Integer> {

    boolean existsByEmail(String email);
}
