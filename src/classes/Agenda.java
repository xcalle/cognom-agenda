package classes;

import java.util.LinkedList;
import java.util.Locale;
import java.util.SplittableRandom;

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
        String nomContacte, cognomContacte;
        boolean existeixElContacte = false;

        nomContacte = contacte.getNom();
        cognomContacte = contacte.getCognom();
        existeixElContacte = this.buscarContacte(nomContacte, cognomContacte);
        if (existeixElContacte) {
            System.out.println("Contacte amb nom " + contacte.getNom()
                    + " ja existeix a lagenda!");
        } else {
            this.llistaContactes.addLast(contacte);
            System.out.println("Contacte amb nom " + contacte.getNom()
                    + " afegit correctament!");
        }
    }

    public boolean buscarContacte(String nomContacteABuscar, String cognomContacteABuscar) {
        boolean trobat = false;
        if (this.llistaContactes.size() == 0) {
            trobat = false;
        } else {
            for (int i = 0; i < this.getLlistaContactes().size(); i++) {
                if ((this.llistaContactes.get(i).getNom().equalsIgnoreCase(nomContacteABuscar)) &&
                        (this.llistaContactes.get(i).getCognom().equalsIgnoreCase(cognomContacteABuscar))) {
                    trobat = true;
                }
            }
        }
        return trobat;
    }

    public void eliminarContacte(Contacte contacte) {
        this.llistaContactes.remove(contacte);
    }
    public void mostrarContactes() {
        if (this.llistaContactes.size() == 0) {
            System.out.println("La agenda està buida!");
        } else {
            for (int i = 0; i < this.getLlistaContactes().size(); i++) {
                System.out.println((i + 1) + ".- " + this.llistaContactes.get(i).getNom() +
                        " " + this.llistaContactes.get(i).getCognom());
            }
        }
//        for (Contacte contacte : this.getLlistaContactes()){
//            System.out.println("Nom   : " + contacte.getNom());
//            System.out.println("Cognom: " + contacte.getCognom());
//        }
    }

}