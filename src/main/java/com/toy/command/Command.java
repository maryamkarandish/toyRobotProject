package com.toy.command;

import com.toy.board.Robot;
import com.toy.board.Table;

/**
 * Created on 3/15/18.
 */
public abstract class Command {

    private String _name;

    /**
     * @return
     */
    public String getName() {
        return this._name;
    }

    /**
     * getting the command name
     *
     * @param name
     */
    public Command(String name) {
        this._name = name;
    }

    /**
     * @param robot
     * @param table
     * @param args
     */
    public abstract void execute(Robot robot, Table table, String... args);
}
