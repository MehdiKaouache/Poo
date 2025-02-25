public class Exo8 {}

class Evalution {
    String nom;
    float ponderation;
    byte noteSur100 = 0;

    public static void main(String[] args) {
        Evalution eval1 = new Evalution("Anglais", 0.1f);
        eval1.noteSur100 = 90;
        eval1.afficherEvaluation();
    }

    public Evalution(String nom, float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public byte notePonderee(){
       return (byte) (this.ponderation * noteSur100);
    }

    public void afficherEvaluation(){
        System.out.println("Evaluation: " + this.nom);
        System.out.println("Pondération: " + this.ponderation);
        System.out.println("Note pondérée: " + notePonderee());
    }
}

