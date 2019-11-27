package PriorityQueue;

import java.util.PriorityQueue;

public class Progrm1 {
	public static void main(String[] args) {

		PriorityQueue<Double> pq=new PriorityQueue<Double>();
		pq.add(56.2);
		pq.add(45.2);
		pq.add(85.01);
		pq.add(0.0);

		for (Double double1 : pq) {
			System.out.println(double1);
		}
	}
}
