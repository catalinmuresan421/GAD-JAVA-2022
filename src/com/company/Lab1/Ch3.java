package com.company.Lab1;

public class Ch3 {
    static int checkForPairs(int[] number, int size) {
        int counter = 0;
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (number[i] + number[j] == 0) {
                    System.out.println("Pair with a given sum are (" + number[i] + "," + number[j] + ")");
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int[] number = {5, 2, -5, 7, -2, -7};
        int size = number.length;

        System.out.println("Total pairs: " + checkForPairs(number, size));
    }

}

