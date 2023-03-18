import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long H = 0;
        long pow = 1;

        for (int i = 0; i < L; i++) {
            H += ((str.charAt(i) - 96) * pow);
            pow = pow * 31;
        }
        System.out.println(H % 1234567891);
    }
}