import java.util.ArrayList;
import java.util.Scanner;

public class Exo49{
	public static void main (String[] args){
		ArrayList<String> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		liste.add("apple");
		liste.add("banana");
		liste.add("cherry");
		liste.add("peach");
		System.out.println(liste);
		
		System.out.print("Entrez un fruit: ");
		String fruit = scanner.next();
		
		for (int i = 0; i < liste.size(); i++){
			if (liste.get(i).equals(fruit)){
				System.out.println("Le fruit " + "'" + fruit + "'" + " a été trouvé dans la liste");
			} else{
				continue;
			}
			
		}
	}
}