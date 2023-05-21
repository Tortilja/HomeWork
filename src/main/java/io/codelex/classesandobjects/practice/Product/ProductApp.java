package io.codelex.classesandobjects.practice.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00,14);
        Product phone = new Product("iPhone 5s", 999.99,3);
        Product projector = new Product("Epson EB-U05",  440.46,1);

        mouse.printProduct();
        phone.printProduct();
        projector.printProduct();

        phone.setPrice(699.96);
        phone.setAmount(5);
        phone.printProduct();


    }
}
