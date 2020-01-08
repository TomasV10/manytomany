package lt.bit.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "destytojai")
public class Destytojas {
    @Id
    private int id;
    @Column(name = "vardas")
    private String vardas;
    @Column(name = "pavarde")
    private String pavarde;

    @OneToMany(mappedBy = "destytojas")
    List<Dalykas>dalykai = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public List<Dalykas> getDalykai() {
        return dalykai;
    }

    public void setDalykai(List<Dalykas> dalykai) {
        this.dalykai = dalykai;
    }

}
