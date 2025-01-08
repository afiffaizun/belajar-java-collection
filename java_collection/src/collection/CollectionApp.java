package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<>();
		
		collection.add("Muhammad");
		collection.add("Afif");
		collection.add("Faizun");
		
		collection.addAll(List.of("Hallo", "Semuanya"));
		
		for (var value: collection) {
			System.out.println(value);
		}
		
		System.out.println("=== REMOVE ===");
		
		collection.remove("Afif");
		collection.removeAll(List.of("Hallo", "Semuanya"));
		
		for (var value: collection) {
			System.out.println(value);
		}
		
		//contains Untuk mengecek
		
		System.out.println(
			collection.contains("Najma")
		);
		
		System.out.println(
			collection.containsAll(List.of("Muhammad", "Faizun"))
		);

	}

}
