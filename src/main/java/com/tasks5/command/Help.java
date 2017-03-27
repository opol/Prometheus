package com.tasks5.command;

/**
 * Created by Ulyana on 24-Mar-17.
 */
public class Help implements Command {
    private String[] helps;


    public Help(String[] help) {
        this.helps=help;

    }

    public void execute() {

        System.out.println(this.helps);
    }
}
