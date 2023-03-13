import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] st = new int[31];
        
        for (int i = 1; i < 29; i++) {
            int p = sc.nextInt();
            st[p] = 1;
        } 
        
        for (int i = 1; i < 31; i++) {
            if (st[i] != 1) System.out.println(i);
        }
        
        sc.close();
    }
}