import java.util.Date;
public class Produit {
    int identifiant;
    String marque,libelle;
    Date dateexp;

    float prix;

    public Produit(int id,String m,String l)
    {
      identifiant=id;
      marque=m;
      libelle=l;
    }
    public Produit(String l,String m,int id)
    {
        libelle=l;
        marque=m;
        identifiant=id;
    }

    public Produit(int identifiant,String m,String l,float p,Date d)
    {
        this.identifiant=identifiant;
        marque=m;
        libelle=l;
        prix=p;
        dateexp=d;
    }

    public Produit(){

    }
    public void afficher()
    {
        System.out.println("id :"+identifiant+" marque :"+marque+" libelle :"
                +libelle+" prix :"+this.prix);
    }


    public String toString()
    {
      return "id :"+identifiant+" marque :"+marque+" libelle :"
              +libelle+" prix :"+this.prix+" Date :"+dateexp;
    }
}

