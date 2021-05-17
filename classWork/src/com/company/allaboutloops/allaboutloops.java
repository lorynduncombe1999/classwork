package com.company.allaboutloops;

public class allaboutloops {

    public static void main(String[] args) {
        simpleLoops();

    }

    public static void simpleLoops() {
        //1. for vs while
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;

        }

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.println(numbers[i]);

        }
        //for each loop, only works with arrays
        //points directly to values not the index
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}