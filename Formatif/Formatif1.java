public class Formatif1{
	public static void main (String[]args){
		char lettre = 'a';
		int numero = Integer.parseInt(args[0]);
		numero = numero % 26;
		for (int i = 0; i < numero; i++){
			System.out.print((char)(lettre + i));
		}
	}
}