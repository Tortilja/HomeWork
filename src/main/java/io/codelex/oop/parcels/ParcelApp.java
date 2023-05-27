package io.codelex.oop.parcels;

public class ParcelApp {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(40, 50, 60, 25.0f, false);
        System.out.println("Parcel 1 is valid: " + parcel1.validate());
        Parcel parcel2 = new Parcel(100, 40, 50, 35.0f, true);
        System.out.println("Parcel 2 is valid: " + parcel2.validate());
        Parcel parcel3 = new Parcel(100, 150, 90, 35, false);
        System.out.println("Parcel 1 is valid: " + parcel3.validate());
    }
}
