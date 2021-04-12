package pl.patryk.recruitment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Graph {


    public int numberOfseparatedGraphs(int[][] inputArray) {
        int numberOfGraphs = 1;
        List<Integer> flatInputList = new ArrayList<>();

        for (int[] ints : inputArray) {
            flatInputList.add(ints[0]);
            flatInputList.add(ints[1]);
        }
        flatInputList = flatInputList.stream().sorted().collect(Collectors.toList());
        for (int[] ints : inputArray) {
            Stream<Integer> currentPair = flatInputList.stream().filter(integer -> integer == ints[0] || integer == ints[1]);
            if (currentPair.count() == 2){
                numberOfGraphs++;
            }
        }
        return Math.min(numberOfGraphs, inputArray.length);
    }
}
