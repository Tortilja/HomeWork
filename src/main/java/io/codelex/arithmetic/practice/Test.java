package io.codelex.arithmetic.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int R = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(i * R + " ");
        }

        String result = sb.toString().trim();
        System.out.println(result);
    }


}
