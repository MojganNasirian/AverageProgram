package com.codeWithMojgan;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please give me the numbers; ");
            int[] array = new int[] {input.nextInt(), input.nextInt(), input.nextInt()};

        int sum = 0;
        for (int i = 0; i< array.length; i++) {
            sum += array[i];
        }

        int result = (sum / array.length);
        System.out.println(result);
    }
}