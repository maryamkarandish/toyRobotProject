package com.toy.command.impl;

import com.toy.board.Robot;
import com.toy.command.Command;

/**
 * Created by m.karandish on 3/15/18.
 */
public class MoveCommand extends Command {

    private static final String NAME = "MOVE";
//    private Action takingAction;

    public MoveCommand() {
        super(NAME);
    }

    public void execute(Robot robot){
        int currentX = robot.getX();
        int currentY = robot.getY();
        if (robot.getF()==0){
            currentX +=1;
        }else{
            currentY+=1;
        }

    }
}

