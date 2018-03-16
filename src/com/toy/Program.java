package com.toy;

import com.toy.board.Robot;
import com.toy.board.Table;
import com.toy.command.CommandInvoker;

import java.util.Scanner;

/**
 * Created by m.karandish on 3/15/18.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("hi!!!!!!!!!!");

        String inputCmd = "";
        Scanner in = new Scanner(System.in);
//        Action action = new Action();
//        MoveCommand moveCommandRobot = new MoveCommand(action);
        CommandInvoker invoker = new CommandInvoker();

        Table table = new Table(5, 5);
        Robot robot = new Robot();

        while (inputCmd.equalsIgnoreCase("REPORT")){

            System.out.println("Enter a Command");
            inputCmd = in.nextLine();

            invoker.execute(inputCmd, robot);
            table.put(robot);

//            if(inputCmd.equalsIgnoreCase("MOVE")){
//                invoker.takeActions(moveCommandRobot);
//            }
        }

//        invoker.takeActions(moveCommandRobot);
//
//        invoker.placeAction();
    }
}
