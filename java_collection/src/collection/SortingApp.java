package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingApp {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.addAll(List.of("Muhammad", "Afif", "Faizun", "Sukses", "Selalu"));
		
		Collections.sort(list);
		
		for (var value : list) {
			System.out.println(value);
		}
	}

}
