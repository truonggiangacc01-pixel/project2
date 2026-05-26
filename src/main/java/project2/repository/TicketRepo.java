package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
}
