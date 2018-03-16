package com.toy.command.impl;

import com.toy.Constant;
import com.toy.board.Robot;
import com.toy.board.Table;
import com.toy.command.Command;

/**
 * Created on 3/15/18.
 */
public class MoveCommand extends Command {

    private static final String NAME = "MOVE";

    public MoveCommand() {
        super(NAME);
    }

    /**
     * moving on the table
     *
     * @param robot
     * @param table
     * @param args
     */
    public void execute(Robot robot, Table table, String... args) {

        if (robot.getF() == null) {
            System.out.print("please Enter PLACE Command First\n\r");
        } else {
            String direction = robot.getF();
            switch (direction) {
                case Constant.EAST:
                    goX(robot, table, 1);
                    break;
                case Constant.NORTH:
                    goY(robot, table, 1);
                    break;
                case Constant.WEST:
                    goX(robot, table, -1);
                    break;
                case Constant.SOUTH:
                    goY(robot, table, -1);
                    break;
            }
        }


    }

    /**
     * move on x axis
     *
     * @param robot
     * @param table
     * @param con
     */
    private void goX(Robot robot, Table table, int con) {
        int currentX = robot.getX();
        if (con > 0) {
            currentX += 1;
        } else {
            currentX -= 1;
        }
        if (table.putx(currentX)) {
            robot.setX(currentX);
        } else {
            System.out.print("it may drop out of the table...!\n\r");
        }
    }

    /**
     * move on y axis
     *
     * @param robot
     * @param table
     * @param con
     */
    private void goY(Robot robot, Table table, int con) {
        int currentY = robot.getY();
        if (con > 0) {
            currentY += 1;
        } else {
            currentY -= 1;
        }
        if (table.puty(currentY)) {
            robot.setY(currentY);
        } else {
            System.out.print("it may drop out of the table...!\n\r");
        }
    }
}

