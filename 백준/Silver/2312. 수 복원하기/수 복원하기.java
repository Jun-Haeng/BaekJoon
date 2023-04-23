import java.util.*;

public class Main {
    
    // 궅이 map 안쓰고도 할수있다는 생각이 들었다.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = in.nextInt();

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            int tmp = 2;
            while (true) {

                if (N == 1) break;

                if (N % tmp == 0) {
                    N = N / tmp;
                    hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
                } else {
                    tmp++;
                }
            }

            Map<Integer, Integer> treeMap = new TreeMap<>(hashMap);

            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
            }
        }

        System.out.println(sb);
    }
}