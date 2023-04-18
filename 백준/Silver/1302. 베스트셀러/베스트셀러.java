import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = br.readLine();

            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        int max = 0;

        for (String s : map.keySet()) {
            max = Math.max(map.get(s), max);
        }

        ArrayList<String> res = new ArrayList<>();

        for (String s : map.keySet()) {
            if (max == map.get(s)) res.add(s);
        }

        Collections.sort(res);
        System.out.println(res.get(0));

    }
}