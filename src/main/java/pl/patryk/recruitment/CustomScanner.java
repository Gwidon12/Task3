package pl.patryk.recruitment;

import java.util.Arrays;

public class CustomScanner {

    private int numberOfPairs = 0;

    public int[][] scan() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter number of pairs");
        do {
            if (!sc.hasNextInt()) {
                System.out.println("You exited app");
                break;
            } else {
                int a = sc.nextInt();

                if (a < 0) {
                    System.out.println("Enter positive value");
                } else {
                    numberOfPairs = a;
                    break;
                }
            }
        }
        while (sc.hasNextInt());

        int[][] array = new int[numberOfPairs][2];
        int loopCounter = 1;
        for (int[] ints : array) {

            System.out.println("line no. " + loopCounter);

            System.out.println("enter first value");
            ints[0] = sc.nextInt();
            while (ints[0] < 0) {
                System.out.println("Enter positive value");
                ints[0] = sc.nextInt();
            }
            System.out.println("enter second value");
            ints[1] = sc.nextInt();
            while (ints[1] < 0) {
                System.out.println("Enter positive value");
                ints[0] = sc.nextInt();
            }
            loopCounter++;
        }
        System.out.println("Provided array " + Arrays.deepToString(array));
        return array;
    }
}
