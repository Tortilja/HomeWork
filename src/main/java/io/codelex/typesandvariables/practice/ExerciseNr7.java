package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExerciseNr7 {
    public static void main(String[] args) {

        String str;
        int upper=0;

        Scanner scan=new Scanner(System.in);


        System.out.println("Enter the String!");
        str=scan.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }

        }
        System.out.println("Uppercase letters: "+upper);
    }
}
