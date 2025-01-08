package collection;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;
public class MapDefaultMethodApp {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Muhammad", "Afif Value");
		map.put("Alex", "Michele Value");
		
		map.forEach(new BiConsumer<String, String>(){
			@Override
			public void accept(String key, String value) {
				System.out.println(key + " : " + value);
			}
		});
	}

}
