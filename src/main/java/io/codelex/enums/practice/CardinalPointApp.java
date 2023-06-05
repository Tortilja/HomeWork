package io.codelex.enums.practice;

public class CardinalPointApp {
    public static void main(String[] args) {
        // Piekļuve enum vērtībām
        CardinalPoint north = CardinalPoint.NORTH;
        CardinalPoint south = CardinalPoint.SOUTH;
        CardinalPoint east = CardinalPoint.EAST;
        CardinalPoint west = CardinalPoint.WEST;

        // Izdrukā virzienus
        System.out.println("Direction for NORTH: " + north.getDirection());
        System.out.println("Direction for SOUTH: " + south.getDirection());
        System.out.println("Direction for EAST: " + east.getDirection());
        System.out.println("Direction for WEST: " + west.getDirection());
    }
}
