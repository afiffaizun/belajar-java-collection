package collection;
import java.util.List;
import java.util.ArrayList;
public class ListApp {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Muhammad");
		names.add("Afif");
		names.add("Faizun");
		
		names.set(0, "Programmer");
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));

	}

}
