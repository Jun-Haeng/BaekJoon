import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt() % 60;

        String[] ji = { "J", "K", "L", "A", "B", "C", "D", "E", "F", "G", "H", "I" };
        String[] gan = { "7", "8", "9", "0", "1", "2", "3", "4", "5", "6" };

        System.out.println((year % 60 == 0) ? ji[11] + gan[9] : ji[(year - 1) % 12] + gan[(year - 1) % 10]);
    }

}