package com.tasks5.command;

/**
 * Created by Ulyana on 22-Mar-17.
 */
public class Application {
    public static void main(String[] args) {
        Help help=new Help(new String[]{"Help executed"});
        help.execute();

        /*if (args.length==0 || args==null){
            System.out.println("Error");
        } else if(args[0].equals("") || args[0]==null){System.out.println("Error");}
        else{робимо що потрібно}*/
        //YOUR CODE COMES HERE
       /* if (args !=null && args.length >) {
        }
        else {System.out.println("Error");}*/
        /*if ( args == null|| args.length <= 0 || args.length > 2 || args[0] == null) {

            System.out.println("Error");

        } else ....*/
       /* if (args.length <= 0) {

            System.out.println("Error");

        } else {
            Command help = new Help(new String[]{args[0]});
            help.execute();
        }*/
        /*Command echo =new Echo(args[2]);
        echo.execute();
        Command date =new Date(new String[]{args[2]});
        date.execute();
        Command exit =new Exit(new String[]{args[1]});
        exit.execute();*/
    }
}
