import java.util.ArrayList;

public class Exo1{}

class Personne {
    String nom;
    int age;

    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public void afficherListe(){
        System.out.println("Nom: " + this.nom + ", Âge: " + this.age);
    }
    public static void main(String[] args) {
        ArrayList<Personne> liste = new ArrayList<>();
        liste.add(new Personne("John", 30));
        liste.add(new Personne("Sarah", 25));
        liste.add(new Personne("Marc", 35));
        

        for (int i = 0; i < liste.size(); i++){
            liste.get(i).afficherListe();
        }
    }
}
