package io.codelex.typesandvariables.practice;

public class ExerciseNr5 {
    public static void main(String[] args) {
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Information Systems";

        System.out.println("+------------------------------------------------------------+ ");
        System.out.format("| 1 | %37s | %15s | \n", course1, teacher1);
        System.out.format("| 2 | %37s | %15s | \n", course2, teacher2);
        System.out.format("| 3 | %37s | %15s | \n", course3, teacher3);
        System.out.format("| 4 | %37s | %15s | \n", course4, teacher4);
        System.out.format("| 5 | %37s | %15s | \n", course5, teacher5);
        System.out.format("| 6 | %37s | %15s | \n", course6, teacher6);
        System.out.format("| 7 | %37s | %15s | \n", course7, teacher7);
        //in first colon course8 have 37 character
        System.out.format("| 8 | %37s | %15s | \n", course8, teacher8);
        System.out.println("+------------------------------------------------------------+ \n");
    }
}
