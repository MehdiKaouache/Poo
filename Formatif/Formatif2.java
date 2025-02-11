import java.util.Scanner;
import java.util.ArrayList;

public class Formatif2{
	public static void Menu(){
		System.out.println("Menu:");
		System.out.println("1. Ajouter une tâche");
		System.out.println("2. Marquer une tâche comme terminée");
		System.out.println("3. Afficher les tâches");
		System.out.println("4. Terminer le programme");
		System.out.println( "----------------------------------------------");
		
	}
	public static void main (String[] args){
		String messageNbrTache = "Nombre de tâches : ";
		String messageEntrerTache = "Entrez la tâche à ajouter: ";
		String messageChoix = "Entrez votre choix: ";
		String messageAjoute = "Tâche ajoutée: ";
		String messageTacheTerminer = "Tâche terminée: ";
		String messageNumTerminer = "Entrez le numéro de la tâche à marquer comme terminée : ";
		String messageMerci = "Merci d'avoir utilisé le gestionnaire de tâches!";
		String messageTrait = "----------------------------------------------";
		ArrayList<String> tache = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0; i != 4;){
			Menu();
			System.out.println("Nombre de tâches: " + tache.size());
			System.out.print(messageChoix);	
			int numChoix = scanner.nextInt();
			i = numChoix;
			
			if (i == 1){
				System.out.print(messageEntrerTache);
				String tacheAjouter = scanner.next();
				tache.add(tacheAjouter);
				System.out.println(messageAjoute + tacheAjouter);
				System.out.println(messageTrait);
			} 
			else if (i == 2){
				System.out.print(messageNumTerminer);
				int numTache = scanner.nextInt();
				int index = numTache - 1;
				tache.set(index, tache.get(index) + " (Terminée)");
				System.out.println(messageTacheTerminer + tache.get(index));
			} 
			else if (i == 3){
				System.out.println(tache);
			} 
			else if (i == 4){
				System.out.println(messageMerci);
			} 
			else {
				continue;
			}
			
		}
	}
}
