import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        boolean flag = false;
        String str = "";

        while (true) {

            if (flag) break;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;

                    for (int s : arr) {
                        str += String.valueOf(s) + " ";
                    }

                    if (str.equals("1 2 3 4 5 ")) flag = true;

                    System.out.println(str);
                    str = "";
                }
            }
        }

    }
}
