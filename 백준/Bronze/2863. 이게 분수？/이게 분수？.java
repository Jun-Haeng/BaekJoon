import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double D = in.nextDouble();

        double[] arr = new double[4];
        arr[0] = A/C + B/D;
        arr[1] = C/D + A/B;
        arr[2] = D/B + C/A;
        arr[3] = B/A + D/C;

        double max = Double.MIN_VALUE;

        for (double i : arr) {
            max = Math.max(i, max);
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(i);
                break;
            }
        }

    }
}