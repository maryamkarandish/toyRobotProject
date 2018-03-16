package com.toy.board;

/**
 * Created on 3/15/18.
 */
public class Table {
    public static final int LENGTH = 5;
    public static final int WIDTH = 5;

    private int x;
    private int y;

    /**
     * @param x
     * @param y
     */
    public Table(int x, int y) {

    }

    /**
     * validation for moving on x axis
     *
     * @param x
     * @return
     */
    public boolean putx(int x) {
        if (x > 0 && x < LENGTH) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * validation for moving on y axis
     *
     * @param y
     * @return
     */
    public boolean puty(int y) {

        if (y > 0 && y < WIDTH) {
            return true;
        } else {
            return false;
        }
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
}
