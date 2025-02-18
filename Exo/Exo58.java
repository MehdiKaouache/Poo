import java.util.Scanner;
import java.util.ArrayList;

public class Exo58{
	public static void main(String[] args){
		ArrayList<String> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		liste.add("Alice");
		liste.add("Bob");
		liste.add("Charlie");
		liste.add("David");
		System.out.println("ArrayList avant l'échange : " + liste);
		
		System.out.print("Entrez l'indice du premier élément à échanger : ");
		int premierIndex = scanner.nextInt();
		
		System.out.print("Entrez l'indice du deuxième élément à échanger : ");
		int deuxiemeIndex = scanner.nextInt();
		
		liste.set(premierIndex, liste.get(deuxiemeIndex));
		System.out.println("ArrayList après l'échange : " + liste);
	}
}