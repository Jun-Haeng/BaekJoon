import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 1;
        while (true) {

            String a = br.readLine();
            String b = br.readLine();

            if (a.equals("END") && b.equals("END")) break;

            if (a.length() != b.length()) {
                System.out.println("Case " + idx + ": different");
            }

            else {
                int[] A = new int[26];
                int[] B = new int[26];

                for (int i = 0; i < a.length(); i++) {
                    A[a.charAt(i) - 'a']++;
                    B[b.charAt(i) - 'a']++;
                }

                boolean flag = true;
                for (int i = 0; i < 26; i++) {
                    if (A[i] != B[i]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) System.out.println("Case " + idx + ": same");
                else System.out.println("Case " + idx + ": different");
            }

            idx++;
        }
    }
}