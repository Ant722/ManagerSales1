package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long[] prices = {30, 5, 2};

        new SalesManager(prices);

        System.out.println("Hello GITHUB\n" + Arrays.stream(prices).max());
    }
}