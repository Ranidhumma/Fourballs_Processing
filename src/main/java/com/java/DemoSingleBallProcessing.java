package com.java;
import processing.core.PApplet;
/*
 * @Param this class is used to Represent ball challenge
 */

public class DemoSingleBallProcessing extends PApplet {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 280;
    public static final int DIAMETER = 90;
    int x = 0;


    public static void main(String[] args) {
        System.out.println("Welcome to ball Challenge");
        PApplet.main("com.java.DemoSingleBallProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        painWhite();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x, mouseY, DIAMETER, DIAMETER);
        x++;
    }

    private void painWhite() {
        background(255);
    }

    @Override
    public void setup() {

    }

}





