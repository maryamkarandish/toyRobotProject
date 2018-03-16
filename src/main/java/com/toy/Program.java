package com.toy;

import com.toy.board.Table;
import com.toy.board.Robot;
import com.toy.command.CommandInvoker;

import java.util.Scanner;

/**
 * Created on 3/15/18.
 */
public class Program {

    public static void main(String[] args) {
        String inputCmd = "";
        Scanner in = new Scanner(System.in);
        CommandInvoker invoker = new CommandInvoker();
        Table table = new Table(5, 5);
        Robot robot = new Robot();

        while (inputCmd.equalsIgnoreCase("EXIT") == false) {

            System.out.println("Enter a Command");
            inputCmd = in.nextLine();
            invoker.execute(inputCmd.toUpperCase(), robot, table);
        }

        System.out.print("command entering has been terminated...!");
    }
}
