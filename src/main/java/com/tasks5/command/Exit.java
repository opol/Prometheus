package com.tasks5.command;

/**
 * Created by Ulyana on 24-Mar-17.
 */
public class Exit implements Command {
    private String[] exit ={"Goodbye!"};

    public Exit(String[] exit1) {
        this.exit=exit1;
    }

    public void execute() {
        System.out.println(this.exit);
    }
}
