package  com.team3.deviceMgmt.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "role")
    private String role;


    public User() {
        super();
    }

    public User(Long userId, String userName, String role) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.role = role;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}