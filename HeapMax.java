import java.util.List;

public class HeapMax<T extends Comparable<T>> {
    private List<T> heap;

    public HeapMax(List<T> heap) {
        this.heap = heap;
        buildHeap();
    }

    public List<T> getHeap() {
        return heap;
    }

    public void setHeap(List<T> heap) {
        this.heap = heap;
        buildHeap();
    }

    private void heapify(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int greatest;
        if(left < heap.size() && heap.get(left).compareTo(heap.get(i)) > 0)
            greatest = left;
        else
            greatest = i;
        if(right < heap.size() && heap.get(right).compareTo(heap.get(greatest)) > 0)
            greatest = right;
        if(greatest != i) {
            swap(i, greatest);
            heapify(greatest);
        }
    }

    private void buildHeap() {
        for(int i = (int)(heap.size() / 2); i >= 0; i-- )
            heapify(i);
    }

    private void swap(int i, int j) {
        T ob = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, ob);
    }
}
