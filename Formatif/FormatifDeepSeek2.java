import java.util.Scanner;
import java.util.ArrayList;

public class FormatifDeepSeek2{
	public static void Menu(){
		System.out.println("------------------------------------------");
		System.out.println("Menu: ");
		System.out.println("1. Ajouter un contact");
		System.out.println("2. Rechercher un contact par son nom");
		System.out.println("3. Afficher tous les contacts");
		System.out.println("4. Terminer le programme");
	}
	
	public static void main(String[] args){
		String nbrContact = "--- Nombre de contacts: ";
		String trait = "------------------------------------------";
		String entrerChoix = "Entrez votre choix: ";
		String entrerContact = "Entrez le nom du contact: ";
		String entrerNumero = "Entrez le numéro de téléphone: ";
		String contactAjoute = "Contact ajouté: ";
		String listeContacts = "Contacts: ";
		String entrerNomContact = "Entrez le nom du contact à rechercher: ";
		String contactTrouve = "Contact trouvé: ";
		String finProgramme = "Merci d'avoir utilisé le gestionnaire de contacts";
		int count = 0;
		ArrayList<String> contact = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		
		for (int i = 0; i != 4;){
			Menu();
			System.out.println(nbrContact + contact.size() / 2);
			System.out.println(trait);
			
			System.out.print(entrerChoix);
			int numChoix = scanner.nextInt();
			i = numChoix;
			
			if (i == 1){
				System.out.print(entrerContact);
				String nomAjoute = scanner.next();
				
				System.out.print(entrerNumero);
				String numeroAjoute = scanner.next();
				
				contact.add("Nom: " + nomAjoute);
				contact.add("Numéro: " + numeroAjoute );
				System.out.println(contactAjoute + nomAjoute + " - " + numeroAjoute);
				count++;
				
			} else if (i == 2){
				System.out.print(entrerNomContact);
				String nomContactEntree = scanner.next();
				
				for (int j = 0; j < contact.size(); j++){
					if (contact.get(j).equals("Nom: " + nomContactEntree)){
						System.out.println(contactTrouve + contact.get(j) + " - " + contact.get(j + 1));
					}
				}
				
			} else if (i == 3){
				System.out.println(listeContacts);
				System.out.println(contact);
				
			} else if (i == 4){
				System.out.println(listeContacts);
				System.out.println(contact);
				System.out.println(finProgramme);
			} else {
				continue;
			}
			
		}
	}
}