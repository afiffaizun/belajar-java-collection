package collection;
import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapApp {

	public static void main(String[] args) {
		
		NavigableMap<String, String> map = new TreeMap<>();
		
		map.put("Muhammad", "Afif");
		map.put("Faizun", "Najma");
		map.put("Alex", "Michele");
		
		for( var key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(map.lowerKey("Afif"));
		System.out.println(map.higherKey("Faizun"));
		
		NavigableMap<String, String> mapDesc = map.descendingMap();
		
		for( var key : mapDesc.keySet()) {
			System.out.println(key);
		}
	}

}
