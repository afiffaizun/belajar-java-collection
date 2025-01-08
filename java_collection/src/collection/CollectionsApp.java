package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsApp {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.addAll(List.of("Muhammad", "Afif", "Faizun", "Sukses", "Selalu"));
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
