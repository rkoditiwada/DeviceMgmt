package  com.team3.deviceMgmt.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.security.Timestamp;
import java.sql.Time;
import java.util.Date;

@Entity
public class Device {
    @Id
    @GeneratedValue
    private Long deviceId;
    private String deviceName;
    private String description;
    private String type;
    private String userId;
    private String status;
    private String createdBy;
    private Timestamp createdDate;
    private String modifiedBy;
    private Timestamp modifiedDate;


    public Device(Long deviceId, String deviceName, String description, String type, String userId, String status, String createdBy, Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.description = description;
        this.type = type;
        this.userId = userId;
        this.status = status;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }
}