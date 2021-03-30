package pl.patryk.recruitment;

public class Task3 {
    public static void main(String[] args) {

        CustomScanner customScanner = new CustomScanner();
        int[][] scan = customScanner.scan();
        Graph graph = new Graph();
        graph.numberOfseparatedGraphs(scan);
    }

}
