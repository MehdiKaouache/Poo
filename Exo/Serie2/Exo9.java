public class Exo9 {}

class Etudiant {
    int da;
    String nomComplet;
    Evalution[] evalutions = {
        new Evalution("Math", 0.2f),
        new Evalution("Anglais", 0.3f),
        new Evalution("Science", 0.5f)
    };
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(2387924, "Mehdi Kaouache");
        
        etudiant1.evalutions[0].noteSur100 = 80;
        etudiant1.evalutions[1].noteSur100 = 90;
        etudiant1.evalutions[2].noteSur100 = 76;

        etudiant1.afficheResulat();
    }

    public Etudiant(int da, String nomComplet) {
        this.da = da;
        this.nomComplet = nomComplet;

    }

    public byte noteFinale() {
        byte noteFinale = 0;
        for(int i = 0; i < evalutions.length; i++){
            noteFinale += this.evalutions[i].notePonderee();
        }
        return noteFinale;
    }

    public void afficheResulat(){
        System.out.println(this.da + " " + this.nomComplet + " " + evalutions[0].noteSur100 + " " + evalutions[1].noteSur100 + " " + evalutions[2].noteSur100 + " | " + noteFinale());
    }
}
