package collection;

import java.util.Set;
import java.util.LinkedHashSet;
public class SetApp {

	public static void main(String[] args) {
		
		Set<String> names = new LinkedHashSet<>();
		names.add("Muhammad");
		names.add("Afif");
		names.add("Faizun");
		
		names.add("Muhammad");
		names.add("Afif");
		names.add("Faizun");
		
		for ( var name : names) {
			System.out.println(name);
		}

	}

}
