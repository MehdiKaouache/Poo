public class Exo25{
	public static void main(String[] args){
		char[] alphabet =  {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		System.out.println("L'alphabet a " + alphabet.length + " lettres");
		
		for (int i = 0; i < alphabet.length; i++){
			alphabet[i] = Character.toUpperCase(alphabet[i]);
		}
		
		System.out.println(alphabet);
	}
}