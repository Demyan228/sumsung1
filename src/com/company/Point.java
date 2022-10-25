package com.company;


import java.lang.Math;

public class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void invert(){
        int h = x;
        x = y;
        y = h;
    }

    public double getDistance(Point p){
        return Math.sqrt(((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y)));
    }
}
