package project2.entity;

import jakarta.persistence.*;
import project2.enums.RaceScheduleStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RaceSchedule")
public class RaceSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name = "name", columnDefinition = "NVARCHAR(255)", nullable = false)
    private String name;

    @Column(name ="race_date", nullable = false)
    private LocalDate raceDate;

    @Column(name = "location", columnDefinition = "NVARCHAR(100)", nullable = false)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    private RaceScheduleStatus status;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ GIỮA RaceSchedule - Tournament
    //1, N RaceSchedule bất kỳ phải thuộc về 1 Tournament
    @ManyToOne
    @JoinColumn(name = "TournamentId")
    private Tournament tournament;

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (RaceSchedule - Prediction)
    //1 RaceSchedule --< có nhiều Prediction - List<Prediction>
    @OneToMany(mappedBy = "raceSchedule", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Prediction> predictionList = new ArrayList<>();

    public void addPrediction(Prediction o){
        predictionList.add(o);
        o.setRaceSchedule(this);
    }

    public void removePrediction(Prediction o){
        predictionList.remove(o);
        o.setRaceSchedule(null);
    }


    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (RaceSchedule - RaceParticipation)
    //1 RaceSchedule --< có nhiều RaceParticipation - List<RaceParticipation>
    @OneToMany(mappedBy = "raceSchedule", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RaceParticipation> raceParticipationList = new ArrayList<>();

    public void addRaceParticipation(RaceParticipation o){
        raceParticipationList.add(o);
        o.setRaceSchedule(this);
    }

    public void removeRaceParticipation(RaceParticipation o){
        raceParticipationList.remove(o);
        o.setRaceSchedule(null);
    }

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (RaceSchedule - RaceResult)
    //1 RaceSchedule --< có nhiều RaceResult - List<RaceResult>
    @OneToMany(mappedBy = "raceSchedule", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RaceResult> raceResultList = new ArrayList<>();

    public void addRaceResult(RaceResult o){
        raceResultList.add(o);
        o.setRaceSchedule(this);
    }

    public void removeRaceResult(RaceResult o){
        raceResultList.remove(o);
        o.setRaceSchedule(null);
    }


    /*___________________________________________________________________________________________________________ */

    public RaceSchedule() {
    }

    public RaceSchedule(String name, LocalDate raceDate, String location, RaceScheduleStatus status, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.raceDate = raceDate;
        this.location = location;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(LocalDate raceDate) {
        this.raceDate = raceDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public RaceScheduleStatus getStatus() {
        return status;
    }

    public void setStatus(RaceScheduleStatus status) {
        this.status = status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RaceSchedule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", raceDate=" + raceDate +
                ", location='" + location + '\'' +
                ", status=" + status +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
