package com.toy.board;

import com.toy.Constant;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 3/15/18.
 */
public class Robot {


    private int x;
    private int y;
    private String f;
    private static ArrayList<String> direction;

    /**
     * @param x
     * @param y
     */
    public Robot(int x, int y) {

    }

    public Robot() {

    }

    /**
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return
     */
    public String getF() {
        return f;
    }


    /**
     * @param f
     */
    public void setF(String f) {
        this.f = f;
    }

    /**
     * readonly direction list
     *
     * @return
     */
    public ArrayList<String> getDirection() {
        if(direction == null)
            direction = new ArrayList<>(Arrays.asList(Constant.EAST, Constant.NORTH, Constant.WEST, Constant.SOUTH));
        
        return direction;
    }

}


