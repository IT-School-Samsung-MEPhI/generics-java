package example2;


import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // Pair<int, String> pair = new Pair<>(1, "abc"); - Неправильно
        /*
         * int - Integer
         * float - Float
         * double - Double
         * bool - Boolean
         */
        Pair<Integer, String> pair1 = new Pair<>(1, "abc");

        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");
        Pair<Integer, Integer> pair2 = new Pair<>(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
        System.out.println(pair2);
    }
}
