import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열을 1과 0으로 나누어서...

        String str = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str, "0");
        StringTokenizer st2 = new StringTokenizer(str, "1");

        System.out.println(Math.min(st1.countTokens(), st2.countTokens()));
    }
}