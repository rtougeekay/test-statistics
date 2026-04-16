package com.pluralsight;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {

        int[] scores = {85, 90, 75, 70, 92, 88, 95, 84, 89, 93};

        int sum = 0;
        Arrays.sort(scores);

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        int high = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > high) {
                high = scores[i];
            }
        }
        System.out.println("Average: " + average);
    }


}




