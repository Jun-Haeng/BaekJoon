import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.next();
        }

        int a1 = 0;
        int a2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("KBS1")) a1 = i;
            if (arr[i].equals("KBS2")) a2 = i;
        }

        if (a1 != 0) {
            for (int i = 0; i < a1; i++) {
                System.out.print(1);
            }

            for (int i = 0; i < a1; i++) {
                System.out.print(4);
            }
        }

        if (a2 != 0 && a2 != 1) {

            if (a1 > a2) {
                for (int i = 0; i < a2+1; i++) {
                    System.out.print(1);
                }

                for (int i = 0; i < a2; i++) {
                    System.out.print(4);
                }

            } else {
                for (int i = 0; i < a2; i++) {
                    System.out.print(1);
                }

                for (int i = 0; i < a2-1; i++) {
                    System.out.print(4);
                }
            }
        }
    }
}