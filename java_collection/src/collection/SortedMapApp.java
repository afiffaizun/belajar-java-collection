package collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Comparator;

public class SortedMapApp {

	public static void main(String[] args) {
		
		Comparator<String> stringComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);;
		
		sortedMap.put("Afif", "Wali");
		sortedMap.put("Budi", "Alex");
		sortedMap.put("Wali", "Wali");
		
		for ( var key : sortedMap.keySet() ) {
			System.out.println(key);
		}
		

	}

}
