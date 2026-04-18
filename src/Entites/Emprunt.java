package Entites;

import java.util.Date;

import java.util.Date;

public class Emprunt {
    private Date dateemprunt;
    private Livre livre;
    private Lecteur lector;
    private int delai;     // délai en jours
    private int nblevel;   // nombre de livres empruntés

    // Constructeur
    public Emprunt(Date dateemprunt, Livre livre, Lecteur lector, int delai, int nblevel) {
        this.dateemprunt = dateemprunt;
        this.livre = livre;
        this.lector = lector;
        this.delai = delai;
        this.nblevel = nblevel;
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Emprunt : " + lector.getPrenom() + " " + lector.getNom() +
                " a emprunté \"" + livre.getTitre() + "\" le " + dateemprunt +
                " (délai : " + delai + " jours, nb livres : " + nblevel + ")");
    }

    // Getters
    public Date getDateemprunt() { return dateemprunt; }
    public Livre getLivre() { return livre; }
    public Lecteur getLector() { return lector; }
    public int getDelai() { return delai; }
    public int getNblevel() { return nblevel; }

    // Setters
    public void setDateemprunt(Date dateemprunt) { this.dateemprunt = dateemprunt; }
    public void setLivre(Livre livre) { this.livre = livre; }
    public void setLector(Lecteur lector) { this.lector = lector; }
    public void setDelai(int delai) { this.delai = delai; }
    public void setNblevel(int nblevel) { this.nblevel = nblevel; }
}
