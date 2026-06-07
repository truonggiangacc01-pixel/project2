package project2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RaceReferee")
public class RaceReferee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name", columnDefinition = "NVARCHAR(255)", nullable = false)
    @NotBlank(message = "The userName is require")
    @Size(min = 4, max = 255, message = "The userName must be in bettwen 4 to 255 character length")
    private String fullName;

    @Column(name = "user_name", columnDefinition = "NVARCHAR(255)", nullable = false, unique = true)
    @NotBlank(message = "The userName is require")
    @Size(min = 4, max = 255, message = "The userName must be in bettwen 4 to 255 character length")
    private String username;

    @Column(name = "phone", nullable = false, length = 11)
    @Size(min = 10, max = 11, message = "The phone must be in between 10 to 11 character length")
    private String phone;

    @Column(name = "password", nullable = false, length = 255)
    @NotBlank(message = "The password is require")
    @Size(min = 4, max = 255, message = "The password must be in between 4 to 255 character length")
    private String password;

    @Column(name = "email", nullable = false, length = 100)
    @NotBlank(message = "The email is require")
    @Size(min = 4 , max = 100, message = "The email must be in between 4 to 100 character length")
    private String email;

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (RaceReferee - RaceResult)
    //1 RaceReferee --< có nhiều RaceResult - List<RaceResult>
    @OneToMany(mappedBy = "raceReferee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RaceResult> raceResultList = new ArrayList<>();

    public void addRaceResult(RaceResult o){
        raceResultList.add(o);
        o.setRaceReferee(this);
    }

    public void removeRaceResult(RaceResult o){
        raceResultList.remove(o);
        o.setRaceReferee(null);
    }

    /*___________________________________________________________________________________________________________ */

    //MAPPING MỐI QUAN HỆ 1-N (RaceReferee - Notification)
    //1 RaceReferee --< có nhiều Notification - List<Notification>
    @OneToMany(mappedBy = "raceReferee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Notification> notificationList = new ArrayList<>();;

    public void addNotification(Notification o){
        notificationList.add(o);
        o.setRaceReferee(this);
    }

    public void removeNotification(Notification o){
        notificationList.remove(o);
        o.setRaceReferee(null);
    }

    /*___________________________________________________________________________________________________________ */

    public RaceReferee() {
    }

    public RaceReferee(String fullName, String username, String phone, String password, String email) {
        this.fullName = fullName;
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RaceReferee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
