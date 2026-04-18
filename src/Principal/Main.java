package Principal;

import Entites.Emprunt;
import Entites.Livre;
import Entites.Lecteur;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création de 10 livres avec la syntaxe new
        Livre lv1 = new Livre("Les Misérables", "Victor Hugo", "ISBN001");
        Livre lv2 = new Livre("L'Étranger", "Albert Camus", "ISBN002");
        Livre lv3 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "ISBN003");
        Livre lv4 = new Livre("Madame Bovary", "Gustave Flaubert", "ISBN004");
        Livre lv5 = new Livre("Candide", "Voltaire", "ISBN005");
        Livre lv6 = new Livre("La Peste", "Albert Camus", "ISBN006");
        Livre lv7 = new Livre("Germinal", "Émile Zola", "ISBN007");
        Livre lv8 = new Livre("Bel-Ami", "Guy de Maupassant", "ISBN008");
        Livre lv9 = new Livre("Notre-Dame de Paris", "Victor Hugo", "ISBN009");
        Livre lv10 = new Livre("La Chartreuse de Parme", "Stendhal", "ISBN010");

        // Création de 10 lecteurs avec la syntaxe new
        Lecteur l1 = new Lecteur("Konta", "Aboubacar", "Kalaban Coro", "22");
        Lecteur l2 = new Lecteur("Diallo", "Fatou", "Bamako", "20");
        Lecteur l3 = new Lecteur("Traoré", "Moussa", "Koulikoro", "25");
        Lecteur l4 = new Lecteur("Keita", "Aminata", "Sikasso", "19");
        Lecteur l5 = new Lecteur("Coulibaly", "Oumar", "Kayes", "23");
        Lecteur l6 = new Lecteur("Camara", "Mariama", "Segou", "21");
        Lecteur l7 = new Lecteur("Sissoko", "Ibrahim", "Mopti", "24");
        Lecteur l8 = new Lecteur("Samaké", "Kadidia", "Bamako", "22");
        Lecteur l9 = new Lecteur("Diarra", "Souleymane", "Kati", "26");
        Lecteur l10 = new Lecteur("Konaté", "Binta", "Bamako", "20");
        // Création de 5 emprunts
        Emprunt e1 = new Emprunt(new Date(), lv1, l1, 15, 1);
        Emprunt e2 = new Emprunt(new Date(), lv2, l2, 10, 2);
        Emprunt e3 = new Emprunt(new Date(), lv3, l3, 20, 1);
        Emprunt e4 = new Emprunt(new Date(), lv4, l4, 7, 3);
        Emprunt e5 = new Emprunt(new Date(), lv5, l5, 30, 1);

        // Affichage des emprunts
        System.out.println("=== Liste des emprunts ===");
        e1.afficher();
        e2.afficher();
        e3.afficher();
        e4.afficher();
        e5.afficher();

        // Affichage des livres
        System.out.println("=== Liste des livres ===");
        lv1.afficher();
        lv2.afficher();
        lv3.afficher();
        lv4.afficher();
        lv5.afficher();
        lv6.afficher();
        lv7.afficher();
        lv8.afficher();
        lv9.afficher();
        lv10.afficher();

        // Simulation des emprunts
        System.out.println("\n=== Simulation des emprunts ===");
        l1.emprunter(lv1);
        l2.emprunter(lv3);
        l3.emprunter(lv5);

        // Affichage des lecteurs
        System.out.println("\n=== État des lecteurs ===");
        l1.afficher();
        l2.afficher();
        l3.afficher();
        l4.afficher();
        l5.afficher();
        l6.afficher();
        l7.afficher();
        l8.afficher();
        l9.afficher();
        l10.afficher();
    }
}
