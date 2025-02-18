public class Exo37{
	public static void main (String[] args){
		String majuscule = "Hello";
		String minuscule = "hello";
		
		if (majuscule.equalsIgnoreCase(minuscule)){
			System.out.println("Les chaînes sont égales (en ignorant la casse).");
		}
	}
}