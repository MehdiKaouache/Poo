import java.util.Scanner;

public class Exo33{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez un mot simple: ");
		String mot = scanner.next();
		
		System.out.print("Entrez une lettre présent dans votre mot: ");
		String lettre = scanner.next();
		
		int position = mot.indexOf(lettre);
		System.out.println("Le caractère " + '"' + lettre + '"' + " se trouve à l'indice: " + position);
	}
}