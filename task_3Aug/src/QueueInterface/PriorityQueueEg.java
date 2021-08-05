package QueueInterface;
import java.util.*;
public class PriorityQueueEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		
		queue.add("Pen");
		queue.add("Pencil");
		queue.add("Bag");
		queue.add("Books");
		queue.add("Mobile");
		
		System.out.println("Priority Queue : " +queue);
		System.out.println("First Element using queue.element(): " +queue.element());
		System.out.println("First Element using queue.peek(): " +queue.peek());
		queue.remove();
		queue.poll();
		System.out.println("Printing after removing Queue element using queue.remove() & queue.poll() :" +queue);
		
		Iterator<String> i = queue.iterator();
		System.out.print("Printing queue with Iterator : ");
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
	
	}

}

