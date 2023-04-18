import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            String tmp = "";

            for (int j = i; j < c.length; j++) {
                tmp += c[j];
            }

            arr.add(tmp);
        }

        Collections.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}