package day16_collection_list;

import java.util.LinkedList;
import java.util.Queue;

public class _2_QueueDemo {
	
	// 佇列(Queue): 資料先進先出，所以可用於排隊、派工、進銷存系統
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("John");
		queue.offer("Mary");
		queue.offer("Bobo");
		System.out.println("排隊: " + queue);
		
		System.out.println("依序取出:");
		while (!queue.isEmpty()) {
			String name = queue.poll();	//這裡除了poll外，也可以用remove
			System.out.println(name);
		}
		
		System.out.println("排隊: " + queue);
	}

}
