import java.util.ArrayList;

public class TestList{
	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String>();
		
		animal.add("A");
		animal.add("B");
		animal.add("C");
		animal.add("D");
		
		System.out.println(animal.get(0));
		
		animal.set(0, "Tigre");
		
		System.out.println(animal.get(0));
		
		animal.remove(1);
		
		System.out.println(animal);
		System.out.println(animal.size());
	}
}