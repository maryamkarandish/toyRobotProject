package com.toy.command.impl;

import com.toy.board.Robot;
import com.toy.command.Command;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by m.karandish on 3/15/18.
 */
public class LeftCommand extends Command {

    private static final String NAME = "LEFT";

    public LeftCommand() {
        super(NAME);
    }

    public void execute(Robot robot) {
        ArrayList<String> dirLis = robot.getDirection();
        Iterator itr = dirLis.iterator();
        if(itr.hasNext()){
            itr.next();
        }else{
            itr = dirLis.iterator();
        }
    }
}

