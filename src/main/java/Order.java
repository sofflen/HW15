import java.util.Arrays;

public class Order {

    public void orderNumber(int x) throws NullPointerException {
        Numbers numbers = new Numbers();
        int[] numbs = Integer.toString(x).chars().map(i -> i - '0').toArray();

        if (numbs.length == 1) {
            for (int i = 0; i < 7; i++) {
                if (x == 1)
                    System.out.println(numbers.one(numbs[0])[i]);
                if (x == 2)
                    System.out.println(numbers.two(numbs[0])[i]);
                if (x == 3)
                    System.out.println(numbers.three(numbs[0])[i]);
                if (x == 4)
                    System.out.println(numbers.four(numbs[0])[i]);
                if (x == 5)
                    System.out.println(numbers.five(numbs[0])[i]);
                if (x == 6)
                    System.out.println(numbers.six(numbs[0])[i]);
                if (x == 7)
                    System.out.println(numbers.seven(numbs[0])[i]);
                if (x == 8)
                    System.out.println(numbers.eight(numbs[0])[i]);
                if (x == 9)
                    System.out.println(numbers.nine(numbs[0])[i]);
                if (x == 0)
                    System.out.println(numbers.zero(numbs[0])[i]);
            }
        } else {
            for (int i = 0; i < 7; i++) {
                if (numbs[0] == 1)
                    System.out.println(numbers.one(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 2)
                    System.out.println(numbers.two(numbs[0])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 3)
                    System.out.println(numbers.three(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 4)
                    System.out.println(numbers.four(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 5)
                    System.out.println(numbers.five(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 6)
                    System.out.println(numbers.six(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 7)
                    System.out.println(numbers.seven(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 8)
                    System.out.println(numbers.eight(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.nine(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
                if (numbs[0] == 9)
                    System.out.println(numbers.nine(numbs[0])[i]
                            + numbers.two(numbs[1])[i]
                            + numbers.three(numbs[1])[i]
                            + numbers.four(numbs[1])[i]
                            + numbers.five(numbs[1])[i]
                            + numbers.six(numbs[1])[i]
                            + numbers.seven(numbs[1])[i]
                            + numbers.eight(numbs[1])[i]
                            + numbers.one(numbs[1])[i]
                            + numbers.zero(numbs[1])[i]);
            }
        }
    }
}

