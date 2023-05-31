

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();
    static int time = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];

        if (N == K) {
            System.out.println(0);
            return;
        }

        BFS();
    }

    public static void BFS() {

        q.add(N);
        visited[N] = true;

        while (true) {

            int size = q.size();

            for (int i = 0; i < size; i++) {
                int x = q.remove();

                if (x - 1 == K || x + 1 == K || x * 2 == K) {
                    System.out.println(time);
                    return;
                }

                if (x - 1 > 0 && !visited[x-1]) {
                    visited[x-1] = true;
                    q.add(x-1);
                }

                if (x + 1 < 100001 && !visited[x+1]) {
                    visited[x+1] = true;
                    q.add(x+1);
                }

                if (x * 2 < 100001 && !visited[x*2]) {
                    visited[x*2] = true;
                    q.add(x*2);
                }
            }

            time++;
        }
    }
}