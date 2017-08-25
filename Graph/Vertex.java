public class Vertex <T> {
    private T object;

    public Vertex(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (o.getClass() != Vertex.class) return false;

        Vertex<T> vertex = (Vertex<T>) o;

        if(this.object.equals(vertex.object))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return object != null ? object.hashCode() : 0;
    }
}
