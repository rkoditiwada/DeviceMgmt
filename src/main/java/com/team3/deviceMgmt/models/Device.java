package  com.team3.deviceMgmt.models;
import javax.persistence.*;
import java.security.Timestamp;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "DEVICE")
public class Device {
    @Id
    @GeneratedValue
    @Column(name = "deviceId", nullable = false)
    private Long deviceId;

    @Column(name = "deviceName")
    private String deviceName;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "userId")
    private String userId;

    @Column(name = "status")
    private String status;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdDate")
    private Timestamp createdDate;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @Column(name = "modifiedDate")
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

    public Device() {
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}