package io.codelex.loops.practice;

public class Vowels {

    //TODO: print all vowels using for and foreach
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vowels.length; i++) {
            System.out.print(vowels[i]);
        }

        System.out.println("");

        for (char vowel : vowels) {
            System.out.print(vowel);
        }
    }

}
