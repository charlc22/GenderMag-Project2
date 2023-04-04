package Gendermag2;

import java.util.Comparator;

import Lab4.Heap;

public class HeapSort {
	/** Heap sort method */
	public static <E> void heapSort(E[] list) {
		// Create a Heap of integers
		heapSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
	}

	/** Heap sort method */
	public static <E> void heapSort(E[] list, Comparator<E> c) {
		// Create a Heap of integers
		Heap<E> heap = new Heap<>(c);

		// Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);

		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}

	/** A test method */
	public static void main(String[] args) {
		// Create an array of Song objects with the 20 songs

		String[] list = {"Pride", "Father Stretch My Hands Pt. 1",
				"After the Storm", "Chanel", "Long Time - Intro",
				"Skeezers", "Dreams Fairytales Fantasies", 
				"Right my Wrongs", "Life Goes On", "Stargirl Interlude",
				"Kiss it Better", "Jetfuel", "Still Think About You",
				"Pink + White", "way back", "Feeling", "Violent Crimes",
				"Practice", "Shoota", "Reminder"};
		heapSort(list);
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i]);
	}

}
