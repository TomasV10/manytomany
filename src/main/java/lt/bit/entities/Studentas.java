package lt.bit.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "studentai")
public class Studentas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "vardas")
    private String vardas;
    @Column(name = "pavarde")
    private String pavarde;

    @OneToMany(mappedBy = "studentas")
    private List<Pazymys>pazymiai = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "studentas_dalykai",
    joinColumns = @JoinColumn(name = "studentas_id"),
    inverseJoinColumns = @JoinColumn(name = "dalykas_id"))
    private Set<Dalykas> dalykai = new HashSet<>();

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

    public List<Pazymys> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Pazymys> pazymiai) {
        this.pazymiai = pazymiai;
    }

    public Set<Dalykas> getDalykai() {
        return dalykai;
    }

    public void setDalykai(Set<Dalykas> dalykai) {
        this.dalykai = dalykai;
    }

}
