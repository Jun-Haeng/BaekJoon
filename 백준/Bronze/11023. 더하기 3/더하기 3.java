import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int sum = 0;
        while (in.hasNext()) {
            sum += in.nextInt();
        }

        System.out.println(sum);
    }
}