package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Ticket;
import project2.repository.TicketRepo;

@Service
public class TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    public void saveTicket(Ticket ticket) {
        ticketRepo.save(ticket);
    }
}