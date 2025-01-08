package collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("nama.first", "Muhammad");
		map.put("nama.middle", "Afif");
		map.put("nama.last", "Faizun");
		
		System.out.println(map.get("nama.first"));
		System.out.println(map.get("nama.middle"));
		System.out.println(map.get("nama.last"));
	}

}
