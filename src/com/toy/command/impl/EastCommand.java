package com.toy.command.impl;

import com.toy.board.Robot;
import com.toy.command.Command;

import java.util.ArrayList;

/**
 * Created by m.karandish on 3/15/18.
 */
public class EastCommand extends Command {

    private static final String NAME = "EAST";
//    private Action takingAction;

    public EastCommand() {
        super(NAME);
    }

    public void execute(Robot robot){
        ArrayList<String> dirList= new ArrayList<String>();
        dirList.add("E");
        dirList.add("N");
        dirList.add("S");
        dirList.add("W");
        robot.setDirection(dirList);
    }
}

