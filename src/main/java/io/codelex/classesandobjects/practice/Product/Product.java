package io.codelex.classesandobjects.practice.Product;

public class Product {
    private String productName;
    private double price;
    private int amount;

    Product(String productName, double price, int amount){
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }
    public void printProduct(){
        System.out.println(this.productName + ", price " + String.format("%.2f", this.price).replace(",", ".")
                + ",  amount " + this.amount);
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

}
