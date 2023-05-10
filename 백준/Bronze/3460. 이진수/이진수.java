import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            int n = in.nextInt();

            String binaryN = Integer.toBinaryString(n);

            for (int i = binaryN.length() - 1; i >= 0; i--) {
                if (binaryN.charAt(i) == '1') {
                    System.out.print(binaryN.length() - 1 - i);
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
}