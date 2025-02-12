public class Formatif1{
	public static void main (String[]args){
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int numero = Integer.parseInt(args[0]);
		numero %= 26;
		
		for (int i = 0; i < numero; i++){
			System.out.print(alphabet[i]);
		}
	}
}
