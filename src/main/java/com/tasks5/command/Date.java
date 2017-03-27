package com.tasks5.command;

/**
 * Created by Ulyana on 24-Mar-17.
 */
public class Date implements Command {
    private String[] s = {"date","now"};

    public Date(String[] text) {
        this.s = text;
    }

    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
