import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt() - 1;
        int d = sc.nextInt();

        int[] days = new int[]
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < m; i++) {
            d += days[i];
        }

        if (d % 7 == 1) System.out.println("MON");
        else if (d % 7 == 2) System.out.println("TUE");
        else if (d % 7 == 3) System.out.println("WED");
        else if (d % 7 == 4) System.out.println("THU");
        else if (d % 7 == 5) System.out.println("FRI");
        else if (d % 7 == 6) System.out.println("SAT");
        else if (d % 7 == 0) System.out.println("SUN");

    }
}