import java.util.ArrayList;
import java.util.Scanner;

public class Exo41{
	public static void main(String[] args){
		ArrayList<String> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		liste.add("a");
		liste.add("b");
		liste.add("c");
		liste.add("d");
		liste.add("e");
		System.out.println(liste);
		
		System.out.print("Entrez un caractère à rechercher: ");
		String lettre = scanner.next();
		
		for (int i = 0; i < liste.size(); i++){
			if(lettre.equals(liste.get(i))){
				System.out.println("Le caractère " + "'" + lettre + "'" + " a été trouvé dans le tableau.");
			}
		}
	}
}