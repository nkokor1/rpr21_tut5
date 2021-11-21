package ba.unsa.etf.rpr.tutorijal5;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String naziv;
    private int ects;
    private List<Student> studenti;

    public Predmet(String naziv, int ects) {
        this.naziv = naziv;
        this.ects = ects;
        studenti = new ArrayList<Student>();
    }

    public int getEcts() {
        return ects;
    }

    public List<Student> dajSpisakUpisanihStudenata() {
        return studenti;
    }

    public String getNaziv() {
        return naziv;
    }

    public boolean dodajStudentaNaPredmet(Student student) {
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Predmet)) {
            return false;
        }
        Predmet predmet = (Predmet) o;
        return predmet.naziv.equals(this.naziv) && predmet.getEcts() == this.ects;
    }
}
