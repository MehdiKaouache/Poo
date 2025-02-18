import java.util.ArrayList;
import java.util.Scanner;

public class Exo57{
	public static void main(String[] args){
		ArrayList<Integer> liste =  new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		liste.add(5);
		liste.add(10);
		liste.add(15);
		liste.add(20);
		liste.add(25);
		liste.add(30);
		System.out.println(liste);
		
		System.out.print("Entrez un nombre à supprimer : ");
		int nombre = scanner.nextInt();
		
		for (int i = 0; i < liste.size(); i++){
			if (liste.get(i) == nombre){
				liste.remove(liste.get(i));
			} else {
				continue;
			}
		}
		System.out.println("ArrayList mis à jour : " + liste);
	}
}
