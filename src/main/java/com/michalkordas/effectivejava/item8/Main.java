package com.michalkordas.effectivejava.item8;

public class Main {

    public static void main(String[] args) {
        new Point(1, 2);
        new ColorPoint(1, 2, "red");
    }
}

class Point {

    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint {

    private final int x;
    private final int y;
    private final String color;

    ColorPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
