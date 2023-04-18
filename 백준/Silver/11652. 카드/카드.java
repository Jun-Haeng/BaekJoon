import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        ArrayList<Integer> list = new ArrayList<>(map.values());

        for (Integer value : list) {
            max = Math.max(max, value);
        }

        Long res = Long.MAX_VALUE;

        for (Long aLong : map.keySet()) {
            if (map.get(aLong) == max) {
                res = Math.min(res, aLong);
            }
        }

        System.out.println(res);


    }
}