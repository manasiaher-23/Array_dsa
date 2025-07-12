package Cogni;

import java.util.Arrays;
import java.util.Scanner;

public class Credit_pair {
    static void max_pair(int[] credit, int[] limits) {
        int cnt = 0;
        Arrays.sort(credit);
        Arrays.sort(limits);

        for (int i = 0; i < credit.length; i++) {
            for (int j = 0; j < limits.length; j++) {
                if (limits[j] > credit[i]) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter sub");
        int sub = o.nextInt();
        int[] Cred = new int[sub];
        // inp
        for (int i = 0; i < sub; i++) {
            Cred[i] = o.nextInt();
        }
        // System.out.println("enter no fo stud");
        int No_stud = o.nextInt();
        int[] lim_cred = new int[No_stud];
        for (int i = 0; i < No_stud; i++) {
            lim_cred[i] = o.nextInt();
        }

        max_pair(Cred, lim_cred);
        o.close();
    }

}
