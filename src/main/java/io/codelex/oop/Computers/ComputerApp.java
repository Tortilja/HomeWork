package io.codelex.oop.Computers;

public class ComputerApp {
    public static void main(String[] args) {
        Computer computer1 = new Computer("i7", "16GB", "NVIDIA GeForce RTX 3080", "Dell", "XPS 15");
        Computer computer2 = new Computer("i5", "8GB", "AMD Radeon RX 580", "HP", "Pavilion");

        Laptop laptop1 = new Laptop("i9", "32GB", "NVIDIA GeForce RTX 3090", "Apple", "MacBook Pro", "Li-Po 100Wh");
        Laptop laptop2 = new Laptop("Ryzen 7", "16GB", "NVIDIA GeForce GTX 1650", "Lenovo", "ThinkPad X1 Carbon", "Li-Po 80Wh");

        System.out.println(computer1.getCompany());
        System.out.println(computer2.getGraphicsCard());
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(laptop1);
        System.out.println(laptop2);

        System.out.println(computer1.equals(computer2));
        System.out.println(laptop1.equals(laptop2));
    }
}
