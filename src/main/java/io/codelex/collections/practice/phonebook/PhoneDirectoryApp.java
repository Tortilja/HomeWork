package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryApp {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Pievienojam telefona numurus
        phoneDirectory.putNumber("John Doe", "123456789");
        phoneDirectory.putNumber("Jane Smith", "987654321");

        // Atrodam telefona numurus
        String johnsNumber = phoneDirectory.getNumber("John Doe");
        String janesNumber = phoneDirectory.getNumber("Jane Smith");

        System.out.println("John's number: " + johnsNumber);
        System.out.println("Jane's number: " + janesNumber);
    }
}
