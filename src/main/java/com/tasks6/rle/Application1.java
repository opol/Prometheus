package com.tasks6.rle;

public class Application1 {
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
                boolean coincidence = false;
                int count = 1;
                while (i+1<source.length && source[i]==source[i+1] && count<9){
                    count++;
                    i++;
                    coincidence = true;
                }

                dest.append(source[i]);
                if (coincidence){
                    dest.append(count);
                }
            }
            System.out.print(dest.toString());
        }
    }

}
