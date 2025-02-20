import java.util.Scanner;
import java.util.ArrayList;

public class Exo71{
	public static void Menu(){
		System.out.println("Menu: ");
		System.out.println("1. Ajouter un item");
		System.out.println("2. Retirer un item");
		System.out.println("3. Afficher le reçu");
		System.out.println("4. Terminer la transaction");
	}
	public static void  main(String[] args){
		ArrayList<String> plats = new ArrayList<>();
		ArrayList<Double> prix = new ArrayList<>();
		ArrayList<String> platsAjouter = new ArrayList<>();
		ArrayList<Double> prixPlats = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		
		plats.add("Crevette");
		plats.add("Salade");
		plats.add("Frite");
		plats.add("Hamburger");
		plats.add("Gâteau");
		
		prix.add(8.99);
		prix.add(5.60);
		prix.add(6.40);
		prix.add(10.99);
		prix.add(7.99);
		
		for (int i = 0; i != 4;){
			System.out.println("--------------------------------");
			Menu();
			System.out.println("Total de la facture actuelle: " + total + "$");
			
			System.out.print("Entrez votre choix: ");
			int numChoix = scanner.nextInt();
			i = numChoix;
			
			if(i == 1){
				for (int j = 0; j < plats.size(); j++){
					int index = j + 1;
					System.out.println("\n" + index + ". " + plats.get(j) + " " + prix.get(j) + "$" + "\n");
				}
				System.out.print("Entrez le numéro de l'item: ");
				int numItem = scanner.nextInt();
				numItem--;
				
				for (int k = 0; k < plats.size(); k++){
					if (numItem == k){
						System.out.println("Plat ajouté: " + plats.get(k));
						platsAjouter.add(plats.get(k));
						prixPlats.add(prix.get(k));
						total += prix.get(k);
					}
				}
			} else if(i == 2){
				System.out.print("Entrez l'item à retirer: ");
				String itemRetirer = scanner.next();
				
				for (int l = 0; l < platsAjouter.size(); l++){
					if (platsAjouter.get(l).equalsIgnoreCase(itemRetirer)){
						total -= prixPlats.get(l);
						platsAjouter.remove(platsAjouter.get(l));
						prixPlats.remove(prixPlats.get(l));
						System.out.println("Item retiré: " + itemRetirer);
					}
				}
			} else if(i == 3){
				System.out.println("Reçu: " + "\n");
				for (int m = 0; m < platsAjouter.size(); m++){
					System.out.println(platsAjouter.get(m) + "  " + prixPlats.get(m) + "$");
					System.out.println("------------------");
				}
				System.out.println("Total: " + "\t" + total + "$");
			} else if (i == 4){
				for (int n = 0; n < platsAjouter.size(); n++){
					System.out.println(platsAjouter.get(n) + "  " + prixPlats.get(n) + "$");
					System.out.println("------------");
				}
				System.out.println("Total: " + "\t" + total + "$");
				System.out.println("Merci pour votre visite!");
			}
		}
	}
}