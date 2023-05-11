package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insert Min Value: ");
        int min = in.nextInt();

        System.out.print("Insert Max Value: ");
        int max = in.nextInt();



        for (int i = min; i <= max; i++) {
            for (int j = 0; j < max - min + 1; j++) {
                int num = (i + j - min) % (max - min + 1) + min;
                System.out.print(num);

            }
            System.out.println();
        }
    }
}
