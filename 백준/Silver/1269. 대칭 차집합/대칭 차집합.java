
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N + M; i++) {
            int n = in.nextInt();

            if (hashSet.contains(n)) hashSet.remove(n);
            else hashSet.add(n);
        }

        System.out.println(hashSet.size());
    }
}