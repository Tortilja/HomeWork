package io.codelex.enums.practice;

public enum CardinalPoint {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private String direction;

    private CardinalPoint(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
