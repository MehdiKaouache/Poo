import java.util.Scanner;

public class Exo55{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez une année: ");
		int annee = scanner.nextInt();
		
		if (annee % 4 == 0){
			System.out.println("L'année " + annee + " est bissextile.");
		} else{
			System.out.println("L'année " + annee + " n'est pas bissextile.");
		}
	}
}