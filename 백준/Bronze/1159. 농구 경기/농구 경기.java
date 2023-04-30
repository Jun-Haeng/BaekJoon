import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            char c = name.charAt(0);  //첫 글자
            arr[c - 'a']++;  //아스키 코드 이용
        }

        boolean f = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                f = false;
                System.out.print((char) (i + 97));
            }
        }

        if (f) System.out.println("PREDAJA");
    }
}