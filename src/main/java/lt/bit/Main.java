package lt.bit;

import lt.bit.entities.Dalykas;
import lt.bit.entities.Destytojas;
import lt.bit.entities.Studentas;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Destytojas> destytojai = new ArrayList<>();
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        TypedQuery<Destytojas>query = em.createQuery("SELECT d FROM Destytojas d", Destytojas.class);
        destytojai = query.getResultList();
        printDestytojai(destytojai);
        em.getTransaction().commit();
        em.close();
    }

//    private static void printDestytojai( List<Destytojas> destytojai){
//        List<Destytojas>sortedDestytojai = destytojai.stream()
//                .sorted(Comparator.comparing(Destytojas::getVardas).thenComparing(Destytojas::getPavarde))
//                .collect(Collectors.toList());
//        sortedDestytojai.forEach(d -> {
//            System.out.println(d.getVardas() + " " + d.getPavarde());
//            d.getDalykai().forEach(modul -> {
//                System.out.println(modul.getPavadinimas());
//                modul.getStudentai().forEach(stud -> {
//                    System.out.println(stud.getVardas() + " " + stud.getPavarde() + " " + modul.getPavadinimas());
//                    stud.getPazymiai().forEach(paz -> {
//                        System.out.println(paz.getPazymys() + " " + paz.getDate());
//                    });
//                });
//            });
//        });
//    }

    private static void printDestytojai( List<Destytojas> destytojai){

        destytojai.stream()
                .sorted(Comparator.comparing(Destytojas::getVardas).thenComparing(Destytojas::getPavarde))
                .peek(d -> System.out.println(d.getVardas() + " " + d.getPavarde()))
                .map(Destytojas::getDalykai)
                .flatMap(List::stream)
                .peek(modul -> System.out.println(modul.getPavadinimas()))
                .map(Dalykas::getStudentai)
                .flatMap(Set::stream)
                .peek(stud -> System.out.println(stud.getVardas() + " " + stud.getPavarde()))
                .map(Studentas::getPazymiai)
                .flatMap(List::stream)
                .forEach(paz -> System.out.println(paz.getPazymys() + " " + paz.getDate()));
    }
}
