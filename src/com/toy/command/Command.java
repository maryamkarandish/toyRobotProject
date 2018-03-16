package com.toy.command;

import com.toy.board.Robot;

/**
 * Created by m.karandish on 3/15/18.
 */
public abstract class Command {
    private String _name;
    public String getName()
    {
        return this._name;
    }

    public Command(String name) {
        this._name = name;
    }

    public abstract void execute(Robot robot);
}
