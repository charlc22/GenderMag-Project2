package Gendermag2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;
public class SAHeap<T> implements SAQueue<T> {

	private ArrayList<T> heap;
	private Comparator<T> comparator;

	public SAHeap(Comparator<T> comparator) {
		this.heap = new ArrayList<T>();
		this.comparator = comparator;
	}


	@Override
	public void addSong(T song) {
		heap.add(song);
		heapifyUp(heap.size() - 1);
	}

	@Override
	public void deleteAll() {
		heap.clear();
	}

	@Override
	public boolean isEmpty() {
		return heap.isEmpty();
	}

	@Override
	public T peekSong() {
		if (heap.isEmpty()) {
			return null;
		}
		return heap.get(0);
	}

	@Override
	public void pushSong(T song) {
		addSong(song);
	}

	@Override
	public void removeSong(T song) {
		int index = heap.indexOf(song);
		if (index != -1) {
			heap.set(index, heap.get(heap.size() - 1));
			heap.remove(heap.size() - 1);
			heapifyDown(index);
		}
	}

	@Override
	public int size() {
		return heap.size();
	}

	private void heapifyUp(int index) {
		while (index > 0) {
			int parentIndex = (index - 1) / 2;
			if (comparator.compare(heap.get(index), heap.get(parentIndex)) > 0) {
				swap(index, parentIndex);
				index = parentIndex;
			} else {
				break;
			}
		}
	}

	private void heapifyDown(int index) {
		while (true) {
			int leftChildIndex = index * 2 + 1;
			int rightChildIndex = index * 2 + 2;
			if (leftChildIndex >= heap.size()) {
				break;
			}
			int maxChildIndex = leftChildIndex;
			if (rightChildIndex < heap.size() && comparator.compare(heap.get(rightChildIndex), heap.get(leftChildIndex)) > 0) {
				maxChildIndex = rightChildIndex;
			}
			if (comparator.compare(heap.get(maxChildIndex), heap.get(index)) > 0) {
				swap(index, maxChildIndex);
				index = maxChildIndex;
			} else {
				break;
			}
		}
	}

	private void swap(int index1, int index2) {
		T temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}
	public static void main(String [] args) {
		SAHeap<String> songHeap = new SAHeap<String>(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		songHeap.addSong("Pride");
		songHeap.addSong("Father Stretch My Hands Pt. 1");
		songHeap.addSong("After the Storm");
		songHeap.addSong("Chanel");
		songHeap.addSong("Long Time - Intro");
		songHeap.addSong("Skeezers");
		songHeap.addSong("Dreams Fairytales Fantasies");
		songHeap.addSong("Right my Wrongs");
		songHeap.addSong("Life Goes On");
		songHeap.addSong("Stargirl Interlude");
		songHeap.addSong("Kiss it Better");
		songHeap.addSong("Jetfuel");
		songHeap.addSong("Still Think About You");
		songHeap.addSong("Pink + White");
		songHeap.addSong("way back");
		songHeap.addSong("Feeling");
		songHeap.addSong("Violent Crimes");
		songHeap.addSong("Practice");
		songHeap.addSong("Shoota");
		songHeap.addSong("Reminder");
		songHeap.removeSong("Pride");
		songHeap.removeSong("Father Stretch My Hands Pt. 1");
		songHeap.removeSong("After the Storm");
		songHeap.removeSong("Chanel");
		songHeap.removeSong("Long Time - Intro");
		
		for (String song : songHeap.heap) {
		    System.out.println(song);
		}
	}

}


