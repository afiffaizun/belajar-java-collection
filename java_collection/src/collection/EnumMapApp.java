package collection;
import java.util.Map;
import java.util.EnumMap;

public class EnumMapApp {
	public static enum Level {
		FREE, STANDARD, PREMIUM, VIP
	}
	
	public static void main(String[] args) {
		
		Map<Level, String> map = new EnumMap<Level, String>(Level.class);
		map.put(Level.FREE, "Afif");
		map.put(Level.VIP, "Faizun");
		
		for (var key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
