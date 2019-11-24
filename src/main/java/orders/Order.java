package orders;

import java.util.Scanner;

public class Order {

    public void orderNumber() {
        Numbers numbers = new Numbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        String s = sc.next();
        char[] chars = s.toCharArray();
        int[] numbs = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            numbs[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
//        int[] numbs = Integer.toString(x).chars().map(i -> i - '0').toArray();
        int length = numbs.length;
        int ops = 2;
        String[][] alone = new String[7][1];
        String[][] together = new String[7][length];

        if (numbs[0] == 0)
            alone = numbers.zero();
        else if (numbs[0] == 1)
            alone = numbers.one();
        else if (numbs[0] == 2)
            alone = numbers.two();
        else if (numbs[0] == 3)
            alone = numbers.three();
        else if (numbs[0] == 4)
            alone = numbers.four();
        else if (numbs[0] == 5)
            alone = numbers.five();
        else if (numbs[0] == 6)
            alone = numbers.six();
        else if (numbs[0] == 7)
            alone = numbers.seven();
        else if (numbs[0] == 8)
            alone = numbers.eight();
        else if (numbs[0] == 9)
            alone = numbers.nine();

        if (numbs.length == 1)
            together = alone;
        else {
            for (int i = 1; i < numbs.length; i++) {
                if (numbs[i] == 0) {
                    together = concat(alone, numbers.zero(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 1) {
                    together = concat(alone, numbers.one(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 2) {
                    together = concat(alone, numbers.two(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 3) {
                    together = concat(alone, numbers.three(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 4) {
                    together = concat(alone, numbers.four(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 5) {
                    together = concat(alone, numbers.five(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 6) {
                    together = concat(alone, numbers.six(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 7) {
                    together = concat(alone, numbers.seven(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 8) {
                    together = concat(alone, numbers.eight(), ops);
                    alone = together;
                    ops++;
                }
                if (numbs[i] == 9) {
                    together = concat(alone, numbers.nine(), ops);
                    alone = together;
                    ops++;
                }
            }
        }
        numberSout(together);
    }

    private String[][] concat(String[][] arr1, String[][] arr2, int x) {
        String[][] concat = new String[7][x];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                concat[i][j] = arr1[i][j];
            }
            for (int j = arr1[0].length; j < x; j++) {
                concat[i][j] = arr2[i][0];
            }
        }
        return concat;
    }

    private void numberSout(String[][] arr) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
