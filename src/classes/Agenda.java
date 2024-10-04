package classes;

import java.util.LinkedList;

public class Agenda {
    //Atributs
    private LinkedList<Contacte> llistaContactes;
    // Constructors

    public Agenda() {
        this.llistaContactes = new LinkedList<>();
    }

    //Getters i Setters
    public LinkedList<Contacte> getLlistaContactes() {
        return llistaContactes;
    }

    public void setLlistaContactes(LinkedList<Contacte> _llistaContactes) {
        this.llistaContactes = _llistaContactes;
    }

    public void afegirContacte(Contacte contacte) {
        this.llistaContactes.addLast(contacte);
    }
}

