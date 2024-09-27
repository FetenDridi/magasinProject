import java.util.ArrayList;

public class Magasin {
    private int identifiant;
    private String adresse;
    private int capacite;
    private ArrayList<Produit> produits; // Stores products in a dynamic list
    private static int totalProduits = 0; // Tracks total products across all stores

    // Constructor
    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = 50;
        this.produits = new ArrayList<>();
    }

    // Getter and Setter for identifiant and adresse
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Adds a new product to the store
    public boolean ajouterProduit(Produit produit) {
        if (produits.size() < capacite) {
            produits.add(produit);
            totalProduits++; // Increment total products across all stores
            return true;
        } else {
            System.out.println("Capacité maximale atteinte dans le magasin.");
            return false;
        }
    }

    // Displays store details and products
    public void afficherMagasin() {
        System.out.println("Magasin ID: " + identifiant + " Adresse: " + adresse + " Capacité: " + capacite);
        System.out.println("Produits dans le magasin:");
        for (Produit produit : produits) {
            System.out.println("Nom: " + produit.libelle + " Prix: " + produit.prix);
        }
    }

    // Static method to return the total number of products in all stores
    public static int getTotalProduits() {
        return totalProduits;
    }
}
