package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public double getTotalSales() {
        double commissions = totalSales * commissionRate;
        return super.pay() + commissions;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
