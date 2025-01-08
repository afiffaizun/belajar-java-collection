package collection;
import java.util.HashMap;
import java.util.Map;

public class IdentityHashMapApp {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Afif", 15);
		map.put("Faizun", 31);
		
		//Mengecek
		System.out.println("Apakah Afif Ada : " + map.containsKey("Afif"));
		
		//Mengambil
		System.out.println("Usia Afif : " + map.get("Afif"));

	}

}
