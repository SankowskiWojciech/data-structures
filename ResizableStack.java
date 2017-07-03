import java.util.ArrayList;
import java.util.List;

public class ResizableStack<T> {
    private int size;
    private List<T> stack;
    private int pointer;

    public ResizableStack(int size) {
        this.size = size;
        pointer = 0;
        stack = new ArrayList<>(size);
    }

    public T pop() {
        if( isEmpty() )
            return null;
        else
            return stack.get(--pointer);
    }

    public T peek() {
        if( isEmpty() )
            return null;
        else
            return stack.get(pointer - 1);
    }

    public boolean push(T ob) {
        if( isFull() )
            return false;
        else {
            stack.add(pointer++, ob);
            return true;
        }
    }

    public boolean isFull() {
        return pointer == size;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int capacity() {
        return size;
    }

    public int currentSize() {
        return pointer;
    }

    public boolean resize() {
        size *= 2;
        return true;
    }

    public boolean resize(int size) {
        if(size < this.size)
            return false;
        else {
            this.size = size;
            return true;
        }
    }

    public boolean trimToSize(int size) {
        if (size < pointer)
            return false;
        else {
            this.size = size;
            return true;
        }
    }

    public void trim() {
        size = pointer;
    }
}
