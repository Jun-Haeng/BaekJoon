import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr1 = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        String[] arr2 = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

        int D = in.nextInt();
        int M = in.nextInt();

        System.out.println(arr2[(arr1[M - 1] + D - 1) % 7]);
    }
}