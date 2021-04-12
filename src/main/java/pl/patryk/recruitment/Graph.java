package pl.patryk.recruitment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Graph {


    public int numberOfseparatedGraphs(int[][] inputArray) {
        int numberOfGraphs = 0;
        List<Integer> flatInputList = new ArrayList<>();

        for (int[] ints : inputArray) {
            flatInputList.add(ints[0]);
            flatInputList.add(ints[1]);
        }
        flatInputList = flatInputList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < flatInputList.size() - 2; i++) {
            if (flatInputList.get(i) + 1 < flatInputList.get(i + 1)) {
                numberOfGraphs++;
            }
        }

        return numberOfGraphs;
    }
}
