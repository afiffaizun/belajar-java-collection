package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

	public static void main(String[] args) {
		
		Deque<String> tambah = new LinkedList<>();
		
		tambah.offer("Muhammad");
		tambah.offerFirst("Afif");
		tambah.offerLast("Faizun");
		tambah.offer("Sukses");
		
		for( var value : tambah) {
			System.out.println(value);
		}
	}

}
