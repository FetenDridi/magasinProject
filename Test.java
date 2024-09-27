import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // Create default product (no parameters)
        Produit p1 = new Produit();
        p1.identifiant = 1001;
        p1.marque = "Vitalait";
        p1.libelle = "Lait";
        p1.prix = 0.7f;

        // Display details of p1
        System.out.println("Produit 1:");
        p1.afficher();

        // Create another product using constructor with parameters
        Produit p2 = new Produit(1024, "Delice", "Lait");
        System.out.println("Produit 2:");
        p2.afficher();

        // Create a product with full constructor (including price and expiry date)
        Date date = new Date(); // Current date as an example
        Produit p3 = new Produit(11, "Sicam", "Tomate", 1.2f, date);
        System.out.println("Produit 3:");
        p3.afficher();

        // Modify product p1 and display it again
        p1.prix = 0.9f;
        p1.afficher();

        // Display the string representation of p3
        System.out.println("toString of Produit 3:");
        System.out.println(p3.toString());

        // Use the Magasin class to add products and display the store
        Magasin magasin1 = new Magasin(1, "Avenue Habib Bourguiba");
        magasin1.ajouterProduit(p1);
        magasin1.ajouterProduit(p2);
        magasin1.ajouterProduit(p3);

        // Display the store details and products
        magasin1.afficherMagasin();

        // Display total number of products across all stores
        System.out.println("Nombre total de produits dans tous les magasins : " + Magasin.getTotalProduits());
    }
}
