package com.tasks5.command;

/**
 * Created by Ulyana on 24-Mar-17.
 */
public class Echo implements Command {

    private String s = "";
    public Echo(String text) {
        this.s = text;
    }

    public void execute() {
        System.out.println(this.s);
    }
}
