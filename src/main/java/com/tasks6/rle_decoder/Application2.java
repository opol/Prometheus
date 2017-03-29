package com.tasks6.rle_decoder;

public class Application2 {
    public static void main(String[] args) {
        if (args == null || args.length != 1 || args[0] == null || args[0].length() <= 0) {
            return;
        }
        else if (args[0].isEmpty()) {
            System.out.println();
        }
        else {
            char [] source = args[0].toCharArray();

            StringBuilder dest = new StringBuilder();

            for (int i=0; i<source.length; i++){
                String el = String.valueOf(source[i]);
                dest.append(source[i]);
                i++;
                int number = Integer.parseInt(el);
                while (i+1<source.length && number >=2 && number<=9) {
                    i++;
                }
                dest.append(source[i-1]);
            }
                /*try
                {
                    int number = Integer.parseInt(el);
                    while (i+1<source.length && number >=2 && number<=9) {
                        i++;
                    }
                    dest.append(source[i-1]);
                                    }
                catch(NumberFormatException nfe)
                {
                    dest.append(source[i]);
                    i++;
                }*/

            //}
            System.out.print(dest.toString());
        }
    }

}
