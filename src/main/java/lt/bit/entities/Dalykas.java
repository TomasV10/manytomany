package lt.bit.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "dalykai")
public class Dalykas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "pavadinimas")
    private String pavadinimas;
    @ManyToOne
    @JoinColumn(name = "destytojas_id")
    private Destytojas destytojas;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "studentas_dalykai",
    joinColumns = @JoinColumn(name = "dalykas_id"),
    inverseJoinColumns = @JoinColumn(name = "studentas_id"))
    private Set<Studentas> studentai = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Destytojas getDestytojas() {
        return destytojas;
    }

    public void setDestytojas(Destytojas destytojas) {
        this.destytojas = destytojas;
    }

    public Set<Studentas> getStudentai() {
        return studentai;
    }

    public void setStudentai(Set<Studentas> studentai) {
        this.studentai = studentai;
    }


}
