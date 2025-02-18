import java.util.ArrayList;
import java.util.Scanner;

public class Exo48{
	public static void main (String[] args){
		ArrayList<String> liste = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		liste.add("Java");
		liste.add("Python");
		liste.add("C++");
		liste.add("Ruby");
		System.out.println("La taille de l'ArrayList est : " + liste.size());
		
		System.out.print("Entrez un nouveau langage à ajouter : ");
		String langue = scanner.next();
		liste.add(langue);
		
		for(String langues : liste){
			System.out.println(langues);
		}
	}
}