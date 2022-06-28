package com.java;
import processing.core.PApplet;

/**
 * Four balls Challenge using OOPS
 */

public class FourballsOOP extends PApplet {
    public static final int diameter = 10;
    public static final int center = 10;
    public static final int WIDTH = 480;
    public static final int HEIGHT = 640;

    class Processing {
        int speed, height, start, diameter, center;

        public Processing(int speed, int height, int diameter, int center) {
            start = 0;
            this.speed = speed;
            this.height = height;
            this.diameter = diameter;
            this.center = center;
        }

        public void drawCircle() {
            ellipse(start,height, diameter, center);
            start += speed;
        }
    }

    Processing ball1 = new Processing(1, height / 5, diameter, center);
    Processing ball2 = new Processing(2, (2 * height) / 5, diameter, center);
    Processing ball3 = new Processing(3,(3 * height) / 5, diameter, center);
    Processing ball4 = new Processing(4, (4 * height) / 5, diameter, center);


    public static void main(String[] args) {
        PApplet.main("com.java.FourballsOOP", args);
        System.out.println("Welcome to  Four ball OPPs Challenge");
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        ball1.drawCircle();
        ball2.drawCircle();
        ball3.drawCircle();
        ball4.drawCircle();
    }
}


