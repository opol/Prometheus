package com.tasks3;

/**
 * Created by Ulyana on 20-Mar-17.
 */
public class fibonacci {
    //Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    //якщо число не можливо вирахувати поверніть -1

    public fibonacci() {

    }

    ;

    public long getNumber(int position) {
        if (position == -1 || position == 0 || position == 1 || position == 2) {
            return -1;
        }
        return getNumber(position - 1) + getNumber(position - 2);

    }
}
