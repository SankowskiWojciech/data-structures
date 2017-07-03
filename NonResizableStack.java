import java.util.ArrayList;
import java.util.List;

public class NonResizableStack<T> {
    private int size;
    private List<T> stack;
    private int pointer;

    public NonResizableStack(int size) {
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
}
