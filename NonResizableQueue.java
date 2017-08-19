import java.util.ArrayList;
import java.util.List;

public class NonResizableQueue <T> {
    private int size;
    private List<T> queue;

    public NonResizableQueue(int size) {
        this.size = size;
        queue = new ArrayList<>(this.size);
    }

    public boolean enqueue(T ob) {
        if(isFull())
            return false;
        else {
            queue.add(queue.size(), ob);
            return true;
        }
    }

    public T dequeue() {
        if (isEmpty())
            return null;
        else
            return queue.remove(0);
    }

    public boolean isFull() {
        return queue.size() == size;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int currentSize() {
        return queue.size();
    }

    public int size() {
        return size;
    }
}
