package com.toy.command;

import com.toy.board.Robot;
import com.toy.board.Table;
import com.toy.command.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 3/15/18.
 */
public class CommandInvoker {
    private List<Command> commandList;


    private void initialize() {
        this.commandList = new ArrayList<Command>();
        this.commandList.add(new MoveCommand());
        this.commandList.add(new LeftCommand());
        this.commandList.add(new RightCommand());
        this.commandList.add(new ReportCommand());
        this.commandList.add(new PlaceCommand());
    }

    /**
     * @param action
     * @return
     * @throws Exception
     */
    private Command getCommand(String action)
            throws Exception {
        if (this.commandList == null)
            this.initialize();

        for (Command command : this.commandList) {
            if (command.getName().equalsIgnoreCase(action)) {
                return command;
            }
        }

        throw new Exception("This command is not valid");
    }

    /**
     * @param command
     * @param robot
     * @param table
     */
    public void execute(String command, Robot robot, Table table) {
        try {
            String[] cmd = command.split(" ");
            this.getCommand(cmd[0]).execute(robot, table, cmd);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
