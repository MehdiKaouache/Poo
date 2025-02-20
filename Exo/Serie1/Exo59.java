import java.util.Scanner;
import java.util.ArrayList;

public class Exo59{
	public static void main(String[] args){
		ArrayList<String> liste = new ArrayList<>();
		ArrayList<Integer> stock = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		liste.add("Laptop: ");
		liste.add("Smartphone: ");
		liste.add("Casque: ");
		liste.add("Tablette: ");
		
		stock.add(5);
		stock.add(10);
		stock.add(7);
		stock.add(3);
		
		System.out.println("Stock actuel: ");
		System.out.println("------------------------------------");
		for (int i = 0; i < liste.size(); i++){
			System.out.println(liste.get(i) + stock.get(i));
		}
		
		System.out.print("Entrez le nom de l'article à acheter: ");
		String article = scanner.next();
		
		for(int j = 0; j < liste.size(); j++){
			if(liste.get(j).equalsIgnoreCase(article)){
				stock.set(j, stock.get(j) - 1);
				System.out.println("L'article " + article + " a été acheté. Quantité restante : " + stock.get(j));
			}
		}
		
	}
}