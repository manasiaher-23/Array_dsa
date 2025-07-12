package Cogni;

import java.util.Scanner;

public class stock {
    static int best_value(int[] arr) {
        int initial = 0;
        int low = 0;
        int buy_day = 0;
        int max_prof = 0;
        int sellday = 0;
        for (int i = 0; i < arr.length; i++) {

            initial = initial + arr[i];
            if (initial < low) {
                low = initial;
                buy_day = i;
            }

            // prof
            int profit = initial - low;
            if (profit > max_prof) {
                max_prof = profit;
                sellday = i;
            }
        }

        System.out.println("buy" + buy_day);
        System.out.println("sell day" + sellday);
        System.out.println("max" + max_prof);
        return low;
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int N = o.nextInt();
        int[] stocks = new int[N];
        //
        for (int i = 0; i < N; i++) {
            stocks[i] = o.nextInt();
        }
        int best_price = best_value(stocks);
        System.out.println(best_price);
        o.close();
    }

}
