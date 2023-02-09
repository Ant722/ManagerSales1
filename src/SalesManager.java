package src;

import static java.util.Arrays.*;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int croppedMiddl() {

        int sum = stream(sales).sum();
        int croppedMiddl = (sum - (max() + min()))/(sales.length - 2);
        return croppedMiddl;
    }
}
