import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int R1 = in.nextInt();
        int S = in.nextInt();

        System.out.println(2 *S - R1);
    }
}