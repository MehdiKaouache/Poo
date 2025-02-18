import java.util.ArrayList;
import java.util.Scanner;

public class Exo50{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		liste.add(5);
		System.out.println(liste);
		
		System.out.print("Entrez un nombre à supprimer: ");
		int nombre = scanner.nextInt();
		
		for (int i = 0; i < liste.size(); i++){
			if (liste.get(i) == nombre){
				liste.remove(liste.get(i));
			} else{
				continue;
			}
		}
		System.out.println("ArrayList après suppression : " + liste);
	}
}