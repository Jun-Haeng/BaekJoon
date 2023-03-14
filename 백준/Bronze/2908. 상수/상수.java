import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        for (int i = s1.length() - 1; i >= 0; i--) {
            sb1.append(s1.charAt(i));
            sb2.append(s2.charAt(i));
        }

        int i1 = Integer.parseInt(sb1.toString());
        int i2 = Integer.parseInt(sb2.toString());

        if (i1 > i2) System.out.println(i1);
        else System.out.println(i2);
    }
}