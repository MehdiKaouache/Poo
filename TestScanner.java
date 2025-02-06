import java.util.Scanner;

public class TestScanner{
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Veuillez entrez votre prenom: ");
		String prenom = scanner.next();
		
		System.out.print("Veuillez entrez votre nom: ");
		String nom = scanner.next();
		
		System.out.print("Veuillez entrez votre age: ");
		int age = scanner.nextInt();
		
		System.out.println("Votre nom est: " + prenom + " " + nom);
		System.out.println(prenom + " " + nom + " vous avez " + age + " ans.");
	}
}