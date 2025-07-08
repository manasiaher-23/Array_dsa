import java.util.Scanner;

public class Array_rotation {
    static void rotate(int[] a, int start, int end) {
        // start = a[0];
        // end = a[a.length - 1];

        while (end > start) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int[] arr = new int[n];
        //
        for (int i = 0; i < n; i++) {
            arr[i] = o.nextInt();
        }
        System.out.println("Enter K");
        int k = o.nextInt();
        System.out.println("Enter choice for rotations;");
        int choise = o.nextInt();

        switch (choise) {
            case 1:
                System.out.println("left rotation:");
                rotate(arr, 0, k - 1);
                rotate(arr, k, n - 1);
                rotate(arr, 0, n - 1);
                break;

            case 2:
                System.out.println("Right rotaion:");
                rotate(arr, n - k, n - 1);
                rotate(arr, 0, n - k - 1);
                rotate(arr, 0, n - 1);
        }
        for (int i : arr) {
            System.out.print(i + " ");

        }

        o.close();
    }

}
