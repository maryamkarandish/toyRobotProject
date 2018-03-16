package com.toy.command.impl;

import com.toy.board.Robot;
import com.toy.board.Table;
import com.toy.command.Command;

/**
 * Created on 3/15/18.
 */
public class ReportCommand extends Command {

    private static final String NAME = "REPORT";

    public ReportCommand() {
        super(NAME);
    }

    /**
     * display the current position of robot on the table
     *
     * @param robot
     * @param table
     * @param args
     */
    public void execute(Robot robot, Table table, String... args) {
        if (robot.getF()==null){
            System.out.print("please Enter PLACE Command First\n\r");
        }else{
            System.out.print(robot.getX() + "," + robot.getY() + "," + robot.getF() + "\n\r");
        }
    }
}

