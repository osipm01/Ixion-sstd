package Sset;

public class Sset<T> {

    private final T[] elements;
    private int size;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public Sset(int capacity) {
        this.capacity = capacity;
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T element) {
        if (size >= capacity) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                throw new IllegalArgumentException("Element already exists");
            }
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

}
