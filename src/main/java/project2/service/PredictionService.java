package project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project2.entity.Prediction;
import project2.repository.PredictionRepo;

@Service
public class PredictionService {

    @Autowired
    private PredictionRepo predictionRepo;

    public void savePrediction(Prediction prediction) {
        predictionRepo.save(prediction);
    }
}