import java.util.ArrayList;
import java.util.Scanner;

public class Exo38{
	public static void main (String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
		}
		System.out.println(liste);
		
		System.out.print("Entrez un élément à supprimer: ");
		int elementSupprimer = scanner.nextInt();
		
		for (int j = 0; j < liste.size(); j++){
			if (elementSupprimer == liste.get(j)){
				liste.remove(liste.get(j));
			} else{
				continue;
			}
		}
		System.out.println("Nouveau tableau après suppression: " + liste);
	}
}