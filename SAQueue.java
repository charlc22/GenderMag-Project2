package Gendermag2;

public interface SAQueue<T> {
	void addSong(T song);
	void deleteAll();
	boolean isEmpty();
	T peekSong();
	void pushSong(T song);
	void removeSong(T song);
	int size();
}

