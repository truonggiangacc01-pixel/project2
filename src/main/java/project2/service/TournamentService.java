package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Tournament;
import project2.repository.TournamentRepo;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepo tournamentRepo;

    public void saveTournament(Tournament tournament) {
        tournamentRepo.save(tournament);
    }
}