import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class FormatifDeepSeek{
	
	public static void Menu(){
		System.out.println("---------------------------------");
		System.out.println("Menu: ");
		System.out.println("1. Ajouter une note");
		System.out.println("2. Calculer la moyenne");
		System.out.println("3. Afficher la note maximale");
		System.out.println("4. Quitter");
	}
	
	public static void main(String[] args){
		String afficherNbrNotes = "--- Nombres de notes: ";
		String trait = "---------------------------------";
		String entrerChoix = "Entrez votre choix: ";
		String entrerNote = "Entrer la note: ";
		String afficherNoteAjoute = "Note ajoutée: ";
		String afficherNoteMax = "Note maximale: ";
		String afficherMoyenne = "Moyenne des notes: ";
		ArrayList<Double> notes = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		double somme = 0;
		double noteMax;
		
		for(int i = 0; i != 4;){
		Menu();
		System.out.println(afficherNbrNotes + notes.size());
		System.out.println(trait);
		
		System.out.print(entrerChoix);
		int numChoix = scanner.nextInt();
	
		i = numChoix;
		
		if (i == 1){
			System.out.print(entrerNote);
			double noteEntrer = scanner.nextDouble();
			somme += noteEntrer;
			notes.add(noteEntrer);
			System.out.println(afficherNoteAjoute + noteEntrer);
			
		} else if (i == 2){
			double moyenne = somme/notes.size();
			System.out.printf(afficherMoyenne + moyenne);
			
		} else if (i == 3){
			noteMax = Collections.max(notes);
			System.out.println(afficherNoteMax + noteMax);
			
		} else if (i == 4){
			System.out.println("Merci d'avoir utiliser notre programme");
			break;
		} else {
			continue;
		}
		
		}
	}
}