package com.toy.board;

import java.util.ArrayList;

/**
 * Created by m.karandish on 3/15/18.
 */
public class Robot {


    private int x;
    private int y;
    private int f;
    private ArrayList<String> direction = new ArrayList<String>();

    public Robot(int x,int y){

    }

    public Robot(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public ArrayList<String> getDirection() {
        return direction;
    }

    public void setDirection(ArrayList<String> direction) {
        this.direction = direction;
    }
}


