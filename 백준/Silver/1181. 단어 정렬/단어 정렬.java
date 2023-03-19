import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (arr.contains(str)) continue;
            else arr.add(str);
        }

        Collections.sort(arr);

        Comparator<String> c = Comparator.comparingInt(String::length);

        Collections.sort(arr, c);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}