package com.toy.command.impl;

import com.toy.board.Table;
import com.toy.command.Command;
import com.toy.board.Robot;

import java.util.ArrayList;

/**
 * Created on 3/15/18.
 */
public class LeftCommand extends Command {

    private static final String NAME = "LEFT";

    public LeftCommand()
    {
        super(NAME);
    }

    /**
     * Changing the direction of the robot to the left side
     * @param robot
     * @param table
     * @param args
     */
    public void execute(Robot robot, Table table, String... args)
    {
        try {
            String dir = robot.getF();
            ArrayList<String> dirLis = robot.getDirection();
            for (int i = 0; i < dirLis.size() - 1; i++) {
                if (dirLis.get(i).equals(dir)) {
                    robot.setF(dirLis.get(i + 1));
                }
                if (dirLis.get(dirLis.size() - 1).equals(dir)) {
                    robot.setF(dirLis.get(0));
                    return;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
}

