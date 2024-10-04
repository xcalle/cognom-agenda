package classes;

import java.util.LinkedList;

public class Contacte {
    public Contacte(String nom, String cognom, LinkedList<Telefon> llistaTelefons, LinkedList<Adressa> llistaAdreces) {
        this.nom = nom;
        this.cognom = cognom;
        this.llistaTelefons = llistaTelefons;
        this.llistaAdreces = llistaAdreces;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public LinkedList<Telefon> getLlistaTelefons() {
        return llistaTelefons;
    }

    public void setLlistaTelefons(LinkedList<Telefon> llistaTelefons) {
        this.llistaTelefons = llistaTelefons;
    }

    public LinkedList<Adressa> getLlistaAdreces() {
        return llistaAdreces;
    }

    public void setLlistaAdreces(LinkedList<Adressa> llistaAdreces) {
        this.llistaAdreces = llistaAdreces;
    }

    private String nom;
    private String cognom;
    private LinkedList<Telefon> llistaTelefons;
    private LinkedList<Adressa> llistaAdreces;
}