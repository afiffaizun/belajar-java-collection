package collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class EntryMapApp {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Muhammad", "Afif Value");
		map.put("Faizun", "Budi Value");
		map.put("Alex", "Budi Value");
		
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for ( var entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
