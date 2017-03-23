package com.tasks3.fibonacci;

public class Fibonacci {

    public Fibonacci(){

    };
    public static long getNumber(int position) {
        if (position < 1) {
            return -1;
        }
        return getNumber2(position);
    }
    public static long getNumber2(int position) {
        if (position < 0) {
            return -1;
        }
        if (position == 0 || position == 1) {
            return position;
        }
        return (getNumber2(position - 1) + getNumber2(position - 2));
    }
    /*public static void main(String[] args) {
        for (int counter = -1; counter <= 10; counter++) {
            System.out.print(getNumber(counter) + ", ");
        }
    }*/
}