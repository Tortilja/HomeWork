package io.codelex.arithmetic.practice;

public class FooCorporation {
    public static void main(String[] args) {
        payCalculator(7.5, 35);
        payCalculator(8.2, 47);
        payCalculator(10, 73);



    }
    public  static  void payCalculator(double basePay, int hoursWorked){
        double weekPay;

        if (hoursWorked > 60) {
            System.out.println("ERROR, The Employee Worked More Than 60 Hours In This Week");
        } else if (basePay < 8.00) {
            System.out.println("ERROR, The Base Pay Is To Small");
        } else {
            int overTime = hoursWorked - 40;
            if (overTime <= 0){
                weekPay = basePay * hoursWorked;
                System.out.println("Employee worked " + hoursWorked + " hours and earned " + weekPay + "$");
            } else {
                weekPay = 40 * basePay + (overTime * (basePay * 1.50));
                System.out.println("Employee worked " + hoursWorked + " hours and earned " + weekPay + "$");
            }

        }

    }
}
