package com.tasks3;

public class fibonacci {

    public fibonacci(){

    };
    // recursive declaration of method fibonacci
    public static long getNumber(int position) {
        if ((position == -1) || (position == 0) || (position == 1)) {
            return -1;
        }
        return (getNumber(position - 1) + getNumber(position - 2));
    }

    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++)
            System.out.print(getNumber(counter) + ", ");
    }
}