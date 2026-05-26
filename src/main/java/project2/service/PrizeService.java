package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Prize;
import project2.repository.PrizeRepo;

@Service
public class PrizeService {

    @Autowired
    private PrizeRepo prizeRepo;

    public void savePrize(Prize prize) {
        prizeRepo.save(prize);
    }
}