public class Exo27{
	public static void main(String[] args){
		char [] chaine = {'H','e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		System.out.println(chaine);
		int count = 0;
		
		for (int i = 0; i < chaine.length; i++){
			if (chaine[i] == 'a' |chaine[i] == 'e' | chaine[i] == 'i'| chaine[i] == 'o'| chaine[i] == 'u' | chaine[i] == 'y'){
				count++;
			}
		}
		
		System.out.println("Le nombre de voyelles dans la chaîne est: " + count);
		
	}
}