package com.tasks5.command;


public class Echo implements Command {
    private String s = "";
    public Echo(String[] args) {
        if (args.length < 2) {
            return;
        }
        for (int i = 1; i < args.length; i++) {
            s += args[i] + " ";
        }
    }

    public void execute() {
        System.out.println(this.s);
    }
}
