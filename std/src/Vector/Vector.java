package Vector;

public class Vector<T> {

    public final int defaultCapacity = 10;
    private final T[] elements;
    private int size;
    private VectorUtiles utiles = new VectorUtiles();

    @SuppressWarnings("unchecked")
    public Vector(T[] base){
        if (utiles.checkSize(base)){
            this.elements = base;
            this.size = base.length;
        }
        else{
            this.elements = (T[]) new Object[base.length];
            this.size = 0;
        }
        this.size = 0;
    }

    public void add(T element) {
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
