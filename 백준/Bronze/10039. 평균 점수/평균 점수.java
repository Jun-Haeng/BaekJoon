import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 0;

        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            if (score <= 40) score = 40;

            res += score;
        }
        
        sc.close();
        System.out.println(res / 5);
    }
}