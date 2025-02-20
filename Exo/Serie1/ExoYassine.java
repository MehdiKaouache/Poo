import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExoYassine{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> animaux = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			System.out.print("Entrez un animal: ");
			String animalEntrer = scanner.next();
			
			if (animalEntrer.equals("chien")){
				System.out.println("Bonjour");
			}
			if(i < 5){
				animaux.add(animalEntrer);
			} 
			else if(i == 5){
				animaux.add(0, animalEntrer);
			} 
			else if (i == 6){
				animaux.add(3, animalEntrer);
			} 
			else if (i >= 7) {
				animaux.add(animalEntrer);
			}
			else{
				continue;
			}
			
			System.out.println(animaux);
			
			
		}
		Collections.sort(animaux);
		System.out.println(animaux);
			
	}
}