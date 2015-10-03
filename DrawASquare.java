package baa.androidturtle;

import turtle.*;

public class DrawASquare extends Playground
{
    void main()
    {
        clean(WHITE);
        Turtle t = new Turtle(GREEN);
        t.setSize(SMALLSIZE);
        t.setPenColor(RED);
        t.setPenWidth(3);
        t.setSpeed(MAXSPEED);
        for (int i = 0; i < 4; i++) {
            t.fd(100);
            t.rt(90);

        }
    }

}