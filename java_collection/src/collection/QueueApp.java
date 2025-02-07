package collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) {
		
		Queue<String> queue = new ArrayDeque<>(10);
		
		queue.add("Muhammad");
		queue.add("Afif");
		queue.add("Faizun");
		
		for (String next = queue.poll(); next != null; next = queue.poll()) {
			System.out.println(next);
		}
		
		System.out.println(queue.size());
	}

}
