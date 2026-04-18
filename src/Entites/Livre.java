package Entites;

public class Livre {
    private String titre;
    private String auteur;
    private String isbn;

    // Constructeur
    public Livre(String titre, String auteur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Titre : " + titre + ", Auteur : " + auteur + ", ISBN : " + isbn);
    }

    // Getter pour le titre
    public String getTitre() {
        return titre;
    }
}
