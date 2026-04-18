package Entites;

public class Lecteur {
    private String nom;
    private String prenom;
    private String adresse;
    private String age;
    private Livre livreEmprunte;

    // Constructeur
    public Lecteur(String nom, String prenom, String adresse, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Lecteur : " + prenom + " " + nom + ", Adresse : " + adresse + ", Âge : " + age);
        if (livreEmprunte != null) {
            System.out.println("Livre emprunté : " + livreEmprunte.getTitre());
        } else {
            System.out.println("Aucun livre emprunté.");
        }
    }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    // Méthode emprunter
    public void emprunter(Livre livre) {
        this.livreEmprunte = livre;
        System.out.println(prenom + " " + nom + " a emprunté : " + livre.getTitre());
    }
}
