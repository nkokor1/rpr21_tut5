package ba.unsa.etf.rpr.tutorijal5;

import java.util.ArrayList;
import java.util.List;

public class Semestar {
    private String naziv;
    private List<Predmet> izborniPredmeti;
    private List<Predmet> redovniPredmeti;

    public Semestar(String naziv) {
        izborniPredmeti = new ArrayList<Predmet>();
        redovniPredmeti = new ArrayList<Predmet>();
    }
    public boolean dodajRedovni(Predmet predmet) {
        if(redovniPredmeti.size() > 5) {
            System.out.println("Dosegnut je maksimalan kapacitet redovnih predmeta!");
            return false;
        }
        if(redovniPredmeti.contains(predmet)) {
            System.out.println("Predmet već postoji u listi redovnih predmeta!");
            return false;
        }
        redovniPredmeti.add(predmet);
        return true;
    }
    public boolean dodajIzborni(Predmet predmet) {
        if(izborniPredmeti.contains(predmet)) {
            System.out.println("Predmet već postoji u listi izbornih predmeta!");
            return false;
        }
        izborniPredmeti.add(predmet);
        return true;
    }

    public List<Predmet> getRedovniPredmeti() {
        return redovniPredmeti;
    }

    public List<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }
}
