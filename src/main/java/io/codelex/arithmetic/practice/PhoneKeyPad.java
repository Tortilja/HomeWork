package io.codelex.arithmetic.practice;

import java.util.Scanner;

    public class PhoneKeyPad {
        public static void main(String[] args) {

            StringBuilder numberIf = new StringBuilder();
            StringBuilder numberSwitch = new StringBuilder();


            Scanner in = new Scanner(System.in);


            System.out.print("How many digit in your phone number");

            int digitInNumber = in.nextInt();
            int digitInNumberCount = 0;



            while (digitInNumber != digitInNumberCount) {
                System.out.print("Enter a char: ");
                String input = in.next().toLowerCase();

                if (input.contains("a") || input.contains("b") || input.contains("c")) {
                    numberIf.append(2);
                } else if (input.contains("d") || input.contains("e") || input.contains("f")) {
                    numberIf.append(3);
                } else if (input.contains("g") || input.contains("h") || input.contains("i")) {
                    numberIf.append(4);
                } else if (input.contains("j") || input.contains("k") || input.contains("l")) {
                    numberIf.append(5);
                } else if (input.contains("m") || input.contains("n") || input.contains("o")) {
                    numberIf.append(6);
                } else if (input.contains("p") || input.contains("q") || input.contains("r") || input.contains("s")) {
                    numberIf.append(7);
                } else if (input.contains("t") || input.contains("u") || input.contains("v")) {
                    numberIf.append(8);
                } else if (input.contains("w") || input.contains("x") || input.contains("y") || input.contains("z")) {
                    numberIf.append(9);
                }

                switch (input) {
                    case "a", "b", "c" -> numberSwitch.append(2);
                    case "d", "e", "f" -> numberSwitch.append(3);
                    case "g", "h", "i" -> numberSwitch.append(4);
                    case "j", "k", "l" -> numberSwitch.append(5);
                    case "m", "n", "o" -> numberSwitch.append(6);
                    case "p", "q", "r", "s" -> numberSwitch.append(7);
                    case "t", "u", "v" -> numberSwitch.append(8);
                    case "w", "x", "y", "z" -> numberSwitch.append(9);
                    default -> {
                        System.out.print("ERROR! Insert only char!");
                    }
                }


                System.out.println("Number: " + numberIf);
                System.out.println("Number: " + numberSwitch);
                digitInNumberCount++;

            }


        }

    }
