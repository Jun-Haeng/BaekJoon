import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c - 'a' <= -7) {
                sum += c - 'A' + 27;
            } else {
                sum += c - 'a' + 1;
            }
        }

        boolean prime = false;

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                prime = true;
                break;
            }
        }

        if (!prime) {
            System.out.println("It is a prime word.");
        }
        else {
            System.out.println("It is not a prime word.");
        }
    }
}