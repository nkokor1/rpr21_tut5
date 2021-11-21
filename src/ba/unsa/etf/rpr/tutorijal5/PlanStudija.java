package ba.unsa.etf.rpr.tutorijal5;

import java.util.List;

public class PlanStudija {
    private Smjer smjer;
    private List<Semestar> semestri;

    public PlanStudija(Smjer smjer, List<Semestar> semestri) {
        this.smjer = smjer;
        this.semestri = semestri;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public List<Semestar> getSemestri() {
        return semestri;
    }
}
