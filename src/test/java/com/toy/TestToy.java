package com.toy;

import com.toy.board.Robot;
import com.toy.board.Table;
import com.toy.command.CommandInvoker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created on 3/16/2018.
 */
public class TestToy {

    private CommandInvoker invoker;
    private Table table;
    private Robot robot;

    @Before
    public void init() {
        this.invoker = new CommandInvoker();
        this.table = new Table(5, 5);
        this.robot = new Robot();
    }

    /**
     * test to check example1
     */
    @Test
    public void testExample1() {
        invoker.execute("PLACE 0,0,NORTH", robot, table);
        invoker.execute("MOVE", robot, table);
        invoker.execute("REPORT", robot, table);

        /* the answer should be  "0,1,NORTH" */
        assertEquals(0, robot.getX());
        assertEquals(1, robot.getY());
        assertEquals("NORTH", robot.getF());
    }

    /**
     * test to check example2
     */
    @Test
    public void testExample2() {

        invoker.execute("PLACE 0,0,NORTH", robot, table);
        invoker.execute("LEFT", robot, table);
        invoker.execute("REPORT", robot, table);

//        the answer should be  "0,0,WEST"
        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());
        assertEquals("WEST", robot.getF());
    }


//    test to check example
    @Test
    public void testExample3() {

        invoker.execute("PLACE 1,2,EAST", robot, table);
        invoker.execute("MOVE", robot, table);
        invoker.execute("MOVE", robot, table);
        invoker.execute("LEFT", robot, table);
        invoker.execute("MOVE", robot, table);
        invoker.execute("REPORT", robot, table);

//      answer should be 3,3,NORTH
        assertEquals(3, robot.getX());
        assertEquals(3, robot.getY());
        assertEquals("NORTH", robot.getF());
    }

}
