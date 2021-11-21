package ba.unsa.etf.rpr.tutorijal5;

import java.util.Scanner;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private Semestar semestar;
    private Smjer smjer;

    public Student(String ime, String prezime, int brojIndeksa, Smjer smjer, Semestar semestar){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.smjer = smjer;
        this.setSemestar(semestar);
    }

    public boolean setSemestar(Semestar semestar) {
        return true;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public Smjer getSmjer() {
        return smjer;
    }
    public String getImeIPrezime() {
        return this.ime + " " + this.prezime;
    }

    public Semestar getSemestar() {
        return semestar;
    }
    //unutar sebe poziva metodu dodajStudentaNaPredmet klase Predmet
    public boolean upisiNaPredmet(Predmet predmet) throws IllegalArgumentException {
        return true;
    }
    //koristi se u metodi upisiUSljedeciSemestar da ispise studenta sa svih predmeta proslog semestra prije upisa u novi
    public void ispisiSaPredmeta(Predmet predmet) throws IllegalArgumentException{

    }
    public boolean upisiUSljedeciSemestar(PlanStudija planStudija) throws IllegalArgumentException {
        return true;
    }
    //poziva se iz metode upisiUSljedeciSemestar
    private void odaberiIzborne() {
        for(int i = 1; i <= this.semestar.getIzborniPredmeti().size(); i++) {
            System.out.println(i + "-" + this.semestar.getIzborniPredmeti().get(i - 1).getNaziv() + "(" + this.semestar.getIzborniPredmeti().get(i - 1).getEcts() + " ects poena)");
        }
        System.out.println("Unesite id-eve predmeta koje želite odabrati: ");
        Scanner unos = new Scanner(System.in);
        String izborni = unos.nextLine();
    }
}
