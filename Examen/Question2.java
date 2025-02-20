import java.util.Scanner;
import java.util.ArrayList;

public class Question2{
	
	public static void Menu(){
		System.out.println("------------------------------");
		System.out.println("Menu: ");
		System.out.println("1. Ajouter le résultat d'un étudiant");
		System.out.println("2. Afficher la liste des étudiants");
		System.out.println("3. Terminer le programme");
		System.out.println("------------------------------");
	}
	public static void main(String[] args){
		ArrayList<Integer> note = new ArrayList<>();
		ArrayList<String> nom = new ArrayList<>();
		ArrayList<String> prenom = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int somme = 0;
		int moyenne = 0;
		
		for (int i = 0; i != 3;){
			Menu();
			System.out.println("Moyenne du groupe: " + moyenne + "%");
			System.out.println("------------------------------");
				
			System.out.print("Entrez votre choix: ");
			int numChoix = scanner.nextInt();
			i = numChoix;
				
				
			if(i == 1){
				System.out.print("Entrez le prenom de l'étudiant: ");
				String prenomEntree = scanner.next();
				prenom.add(prenomEntree);
					
				System.out.print("Entrez le nom de l'étudiant: ");
				String nomEntree = scanner.next();
				nom.add(nomEntree);
					
				System.out.print("Entrez la note de cet étudiant: ");
				int noteEntree = scanner.nextInt();
				note.add(noteEntree);
				somme += noteEntree;
				moyenne = somme / note.size() ;
					
				System.out.println("Résultat pour " + prenomEntree + " " + nomEntree + " : " + noteEntree + " ajouté" + "\n");
				
			} else if(i == 2){
				System.out.println("\n" + "Liste: " + "\n");
				
				for (int j = 0; j < note.size(); j++){
						System.out.println("Nom: " + prenom.get(j) + " " + nom.get(j) + " | " + "Note: " + note.get(j) + "%");
				}
				System.out.println("------------------------------");
				System.out.println("Moyenne" + "\t"  + somme / note.size() + "%" + "\n");
					
			} else if(i == 3){
				System.out.println("\n" + "Au revoir! ");
				break;
			}
			
		}
	}
}