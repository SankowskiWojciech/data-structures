public class Vertex <T> {
    private T object;

    public Vertex(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
