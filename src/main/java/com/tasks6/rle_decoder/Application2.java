package com.tasks6.rle_decoder;

public class Application2 {
    public static void main(String[] args) {
        if (args == null || args.length != 1 || args[0] == null || args[0].length() <= 0) {
            return;
        } else if (args[0].isEmpty()) {
            System.out.println();
        } else {
            char[] source = args[0].toCharArray();

            StringBuilder dest = new StringBuilder();

            for (int i = 0; i < source.length; i++) {
                if (i >= 1 && source[i] == source[i - 1]) {
                    System.out.println();
                    return;
                }
                String current_el = String.valueOf(source[i]);


                int number = 0;
                try {
                    number = Integer.parseInt(current_el);
                    if (number<2 || number>9){
                        System.out.println();
                        return;
                    } else if (i==0){
                        System.out.println();
                        return;
                    }
                } catch (NumberFormatException e) {
                    dest.append(source[i]);
                    continue;
                }
                int num2 = 0;
                if (i >= 1) {
                    String prev_el = String.valueOf(source[i - 1]);
                    try {
                        num2 = Integer.parseInt(prev_el);
                        System.out.println();
                        return;
                    } catch (NumberFormatException e) {

                    }
                }


                for (int j = 1; j < number; j++) {
                    dest.append(source[i - 1]);
                }
            }

            System.out.print(dest.toString());
        }
    }
}

