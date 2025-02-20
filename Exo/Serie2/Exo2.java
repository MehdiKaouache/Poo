public class Exo2{}

class Examen {
    String nomEtudiant;
    int note;

    public Examen(String nomEtudiant, int note){
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }

    public void afficheResulat(){
        System.out.println(this.nomEtudiant + " : " + this.convertNote());
    }

    public char convertNote(){
        char lettre = 'N';

        if(this.note <= 100 && this.note > 90){
            lettre = 'A';
        } else if(this.note <= 90 && this.note > 80){
            lettre = 'B';
        } else if(this.note <= 80 && this.note > 70){
            lettre = 'C';
        } else if(this.note <= 70 && this.note >= 60){
            lettre = 'D';
        } else if(this.note < 60){
            lettre = 'E';
        } return lettre;
    }
    public static void main(String[] args) {
        Examen examen1 = new Examen("Marie Curie", 85);
        Examen examen2 = new Examen("Paul Martin", 72);
        Examen examen3 = new Examen("Jean Dupont", 95);
        Examen examen4 = new Examen("Lucie Durand", 55);
        Examen examen5 =new Examen("Sophie Lefevre", 65);

        examen1.afficheResulat();
        examen2.afficheResulat();
        examen3.afficheResulat();
        examen4.afficheResulat();
        examen5.afficheResulat();
        
    }
}

