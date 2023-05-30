package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseNr6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Insert the number: ");

        int numberInsert = in.nextInt();
        int count = 0;
        for (int i = 1; i < numberInsert; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }else{
                System.out.print(i + " ");
            }
            count++;
            if(count == 20){
                System.out.println();
                count = 0;
            }
        }

    }
}
