package anwesenheit.example.Rest;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class usersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "rfid_uid")
    private String rfid_uid;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRfid_uid() {
        return rfid_uid;
    }

    public void setRfid_uid(String rfid_uid) {
        this.rfid_uid = rfid_uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
