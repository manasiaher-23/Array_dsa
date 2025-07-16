package Strings_all;

import java.util.Scanner;

public class reverse {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        // for (int i=0;1< s.length/2; i++) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for (char ch : s) {
            System.out.print(ch + " ");
        }
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String s1 = o.nextLine();
        // String s2=o.nextLine();

        char[] ch = s1.toCharArray();
        reverseString(ch);
        o.close();
    }
}
