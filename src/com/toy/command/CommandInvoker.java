package com.toy.command;

import com.toy.board.Robot;
import com.toy.command.impl.LeftCommand;
import com.toy.command.impl.MoveCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.karandish on 3/15/18.
 */
public class CommandInvoker {
    private List<Command> commandList;

    private void initialize()
    {
        this.commandList = new ArrayList<Command>();
        this.commandList.add(new MoveCommand());
        this.commandList.add(new LeftCommand());
    }

    private Command getCommand(String action) throws Exception {
        if (this.commandList == null)
            this.initialize();

        for (Command command : this.commandList) {
            if (command.getName().equalsIgnoreCase(action)) {
                return command;
            }
        }

        throw new Exception("This command is not valid");
    }

    public void execute(String command, Robot robot) {
        try {
            this.getCommand(command).execute(robot);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

//    public void takeActions(Command action){
//        actionList.add(action);
//    }
//
//    public void placeAction(){
//        for (Command action : actionList) {
//            action.execute();
//        }
//
//        actionList.clear();
//    }
}
