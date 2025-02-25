import java.util.Scanner;

public class Exo3{}

class CompteBancaire{
    String titulaire;
    int solde;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de $ que vous voulez déposer: ");
        int nbrDeposer = scanner.nextInt();
    }

    public CompteBancaire(String titulaire, int solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(){
    }

    public void retirer(){

    }

    public void afficherSolde(){

    }

    public void afficherInfo(){

    }

}