package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project2.entity.Admin;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

    boolean existsByEmail(String email);
}
