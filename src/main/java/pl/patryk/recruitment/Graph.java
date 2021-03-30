package pl.patryk.recruitment;

public class Graph {

    private int[][] sortArray(int[][] inputArray, int dimension) {
        if (dimension == 2) {
            for (int[] ints : inputArray) {
                if (ints[0] > ints[1]) {
                    int temp = ints[1];
                    ints[1] = ints[0];
                    ints[0] = temp;
                }
            }
        } else if (dimension == 1) {
            for (int i = 1; i < inputArray.length; i++) {
                int value = inputArray[i][1];
                int previousIndex = i - 1;

                while (previousIndex >= 0 && inputArray[previousIndex][0] > value) {
                    inputArray[previousIndex + 1][0] = inputArray[previousIndex][0];
                    previousIndex--;
                }
                inputArray[previousIndex + 1][0] = value;
            }
        }
        return inputArray;
    }

    public int numberOfseparatedGraphs(int[][] inputArray) {
        int numberOfGraphs = inputArray.length;
        sortArray(inputArray,2);
        sortArray(inputArray,1);

        for (int j = 0; j < inputArray.length - 1; j++) {
            if (inputArray[j][1] == inputArray[j + 1][0]) {
                numberOfGraphs--;
            }
        }
        System.out.println("Number of graphs: " + numberOfGraphs);
        return numberOfGraphs;
    }
}
