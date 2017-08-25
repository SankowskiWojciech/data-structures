import java.util.ArrayList;
import java.util.List;

public class Graph <T>{
    private List<Vertex<T>> vertexList;
    private List<List<Integer>> matrixOfEdges;

    public Graph(List<Vertex<T>> vertexList, List<List<Integer>> matrixOfEdges) {
        this.vertexList = vertexList;
        this.matrixOfEdges = matrixOfEdges;
    }

    public Graph() {
        vertexList = new ArrayList<>();
        matrixOfEdges = new ArrayList<>();
    }

    public void insertVertex(Vertex<T> object) {
        vertexList.add(object);
        matrixOfEdges.add(new ArrayList<>());
    }

    public void insertEdge(int start, int end) {
        matrixOfEdges.get(start).add(end);
    }

    public List<Vertex<T>> getVertexList() {
        return vertexList;
    }

    public List<List<Integer>> getMatrixOfEdges() {
        return matrixOfEdges;
    }

    public List<Integer> getNeighbours(int vertex) {
        return matrixOfEdges.get(vertex);
    }

    public List<Integer> getNeighbours(Vertex vertex) {
        int index = -1;
        for(int i = 0; i < vertexList.size(); i++)
            if(vertex.equals(vertexList.get(i))) {
                index = i;
                break;
            }
        if (index == -1)
            return null;
        else {
            return matrixOfEdges.get(index);
        }
    }

    public int getSize() {
        return vertexList.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < vertexList.size(); i++)
            stringBuilder.append("Vertex(" + i + "): " + matrixOfEdges.get(i).toString() + '\n');
        return stringBuilder.toString();
    }
}
