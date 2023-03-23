import java.util.Arrays;
import java.util.LinkedList;

public class GraphBFS {
    private Node[] nodes;
    private static int EDGE_DISTANCE = 6;

    public GraphBFS(int size) {}
    private class Node {}
    // private Node getNode(int id) {}
    public void addEdge(int first, int second) {}

    public int[] shortestReach(int startId) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(startId);

        int[] distances = new int[nodes.length];
        Arrays.fill(distances, -1);
        distances[startId] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            /*for (int neighbor : nodes[node].neighbors) {
                if (distances[neighbor] == -1) {
                    distances[neighbor] = distances[node] + EDGE_DISTANCE;
                    queue.add(neighbor);
                }
            }*/
        }
        return distances;
    }
}
