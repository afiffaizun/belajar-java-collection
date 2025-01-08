package collection;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;

public class NavigableSetApp {

	public static void main(String[] args) {
		
		NavigableSet<String> names = new TreeSet<>();
		names.addAll(Set.of("Muhammad", "Afif", "Faizun", "Semoga", "Sukses"));
		names.addAll(Set.of("Sehat", "Selalu"));
		names.add("Amin");
		
		//Abjad Z-A
		NavigableSet<String> namesReverse = names.descendingSet();
				
		for ( var name : namesReverse) {
			System.out.println(name);
		}
		
	}

}
