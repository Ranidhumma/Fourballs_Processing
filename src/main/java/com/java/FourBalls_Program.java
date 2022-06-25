package com.java;
import processing.core.PApplet;

public class FourBalls_Program extends PApplet {
    public static final float DIAMETER = 10;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    float p = 0;
    float q = 0;
    float r = 0;
    float s = 0;

    /* main function*/

    public static void main(String[] args) {
        System.out.println("Welcome to  Four ball Challenge");
        PApplet.main("com.java.FourBalls_Program", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(p,96,DIAMETER,DIAMETER);   //HEIGHT/5
        p += 1;
    }
    private void drawCircle2() {

        ellipse(q, 192, DIAMETER, DIAMETER);  //HEIGHT*2/5
        q += 2;
    }

    private void drawCircle3() {

        ellipse(r, 288, DIAMETER, DIAMETER);  //HEIGHT*3/5
        r += 3;
    }

    private void drawCircle4() {

        ellipse(s, 384, DIAMETER, DIAMETER);  //HEIGHT*4/5
        s += 4;
    }

}
