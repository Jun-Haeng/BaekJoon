import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int[] newArr = arr.clone();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                 newArr[i] += arr[j];
            }
        }

        int[] copyArr = new int[arr.length];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = Math.abs(newArr[i] - 100);

            min = Math.min(min, copyArr[i]);
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (min == copyArr[i]) {
                System.out.println(newArr[i]);
                break;
            }
        }
    }
}