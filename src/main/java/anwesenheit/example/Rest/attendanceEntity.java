package anwesenheit.example.Rest;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "attendance")
public class attendanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id", nullable = false)
    private String userid;

    @Column(name = "clockinout", nullable = false)
    private Integer clockinout;


    @Column(name = "clock_in")
    private Timestamp clock_in;

    @Column(name = "rfid_uid", nullable = false)
    private String rfid_uid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return userid;
    }

    public void setUser_id(String user_id) {
        this.userid = user_id;
    }

    public Timestamp getClockin() {
        return clock_in;
    }

    public void setClockin(Timestamp clockin) {
        this.clock_in = clockin;
    }

    public Integer getClockinout() {
        return clockinout;
    }

    public void setClockinout(Integer clockinout) {
        this.clockinout = clockinout;
    }

    public String getRfid_uid() {
        return rfid_uid;
    }

    public void setRfid_uid(String rfid_uid) {
        this.rfid_uid = rfid_uid;
    }
}
