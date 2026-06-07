package project2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Spectator")
public class Spectator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name", columnDefinition = "NVARCHAR(255)", nullable = false, unique = true)
    @NotBlank(message = "The userName is required")
    @Size(min = 4, max = 20, message = "The userName must be in bettwen 4 to 20 character length")
    private String userName;

    @Column(name = "email", length = 100, nullable = false)
    @NotBlank(message = "The email is required")
    @Size(min = 4, max = 100, message = "The email must be in bettwen 4 to 100 character length")
    private String email;

    @Column(name = "password", length = 255, nullable = false)
    @NotBlank(message = "The password is requried")
    @Size(min = 4, max = 255, message = "The password must be in bettwen 4 to 255 character length")
    private String password;

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (Spectator - Ticket)
    //1 Spectator --< có nhiều Ticket - List<Ticket>
    @OneToMany(mappedBy = "spectator",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> ticketList = new ArrayList<>();

    public void addTicket(Ticket o){
        ticketList.add(o);
        o.setSpectator(this);
    }


    public void removeTicket(Ticket o){
        ticketList.remove(o);
        o.setSpectator(null);
    }

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (Spectator - Prediction)
    //1 Spectator --< có nhiều Prediction - List<Prediction>
    @OneToMany(mappedBy = "spectator",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Prediction> predictionList = new ArrayList<>();

    public void addPrediction(Prediction o){
        predictionList.add(o);
        o.setSpectator(this);
    }

    public void removePrediction(Prediction o){
        predictionList.remove(o);
        o.setSpectator(null);
    }

    /*___________________________________________________________________________________________________________ */

    public Spectator() {
    }

    public Spectator(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
