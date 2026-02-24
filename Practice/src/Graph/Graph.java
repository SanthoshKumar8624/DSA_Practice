package Graph;
import java.util.ArrayList;

class Graph {
    int[][] adjacentMatrix;
    ArrayList<Node> nodeList;

    public Graph(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
        adjacentMatrix = new int[nodeList.size()][nodeList.size()];
    }
    public static class Node {//defining Node Structure
        char ch;
        int index;
        Node(char ch, int index) {
            this.ch = ch;
            this.index = index;
        }
    }
    public void path(int row, int col) {//marking in the matrix
        adjacentMatrix[row][col] = adjacentMatrix[col][row] = 1;
    }
    public void print() {
        for (int row = 0; row < adjacentMatrix[0].length; row++) {
            for (int col = 0; col < adjacentMatrix.length; col++) {
                System.out.print(adjacentMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node('A', 0));
        nodeList.add(new Node('B', 1));
        nodeList.add(new Node('C', 2));
        nodeList.add(new Node('D', 3));
        nodeList.add(new Node('E', 4));
        nodeList.add(new Node('F', 5));
//        System.out.println(nodeList);
        Graph graph = new Graph(nodeList);
        graph.path(0, 1);
        graph.path(0, 2);
        graph.path(0, 3);
        graph.path(1, 3);
        graph.path(2, 3);
        graph.path(3, 4);
        graph.path(3, 5);
        graph.path(4, 5);
        graph.path(0, 1);
        graph.print();
    }
}