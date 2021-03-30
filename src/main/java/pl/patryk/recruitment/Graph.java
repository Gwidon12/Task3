package pl.patryk.recruitment;

public class Graph {

    private int[][] sortArray(int[][] inputArray) {
        for (int[] ints : inputArray) {
            if (ints[0] > ints[1]) {
                int temp = ints[1];
                ints[1] = ints[0];
                ints[0] = temp;
            }
        }
        return inputArray;
    }

    public int numberOfseparatedGraphs(int[][] inputArray) {
        int numberOfGraphs = inputArray.length;
        sortArray(inputArray);

        for (int j = 0; j < inputArray.length - 1; j++) {
            if (inputArray[j][1] == inputArray[j + 1][0]) {
                numberOfGraphs--;
            }
        }
            System.out.println("Number of graphs: " + numberOfGraphs);
        return numberOfGraphs;
    }
}
