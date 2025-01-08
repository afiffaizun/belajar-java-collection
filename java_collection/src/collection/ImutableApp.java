package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ImutableApp {

	public static void main(String[] args) {
		
		List<String> mutable = new ArrayList<>();
		mutable.add("Afif");
		mutable.add("Faizun");
		List<String> imutable = Collections.unmodifiableList(mutable);
		
		List<String> elements = List.of("Muhammad", "Afif", "Faizun");
	}

}
