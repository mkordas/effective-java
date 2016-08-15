package com.michalkordas.effectivejava;

public class Item8 {

    public static void main(String[] args) {
        new Point(1, 1);
        new ColorPoint(1, 1, "blue");
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
