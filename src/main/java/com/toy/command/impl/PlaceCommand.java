package com.toy.command.impl;

import com.toy.board.Table;
import com.toy.command.Command;
import com.toy.board.Robot;

/**
 * Created on 3/15/18.
 */
public class PlaceCommand extends Command {

    private static final String NAME = "PLACE";

    public PlaceCommand() {
        super(NAME);
    }


    /**
     * place the robot on the Table
     *
     * @param robot
     * @param table
     * @param args
     */
    public void execute(Robot robot, Table table, String... args) {
        try {
            String[] parameters = args[1].split(",");
            robot.setX(Integer.valueOf(parameters[0]));
            robot.setY(Integer.valueOf(parameters[1]));
            robot.setF(parameters[2].toUpperCase());

        } catch (Exception ex) {
            System.out.print("INVALID command... the command should be Like :  PLACE x,y,Direction" + "\n\r");
        }


    }

}

