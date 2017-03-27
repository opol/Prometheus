package com.tasks5.command;


public class Application {
    public static void main(String[] args) {


        Command command = null;
        if (args == null || args.length <= 0 || args.length > 2 || args[0] == null) {
            System.out.println("Error");
            return;
        } else if ("help".equals(args[0]) && args.length == 1) {
            command = new Help();
        } else if ("echo".equals(args[0]) && args.length == 2) {
            command = new Echo(args);
        } else if ("date".equals(args[0]) && "now".equals(args[1]) && args.length == 2) {
            command = new Date();
        } else if ("exit".equals(args[0]) && args.length == 1) {
            command = new Exit();
        }


        if (command != null) {
            command.execute();
        } else {
            System.out.println("Error");
        }

    }
}
