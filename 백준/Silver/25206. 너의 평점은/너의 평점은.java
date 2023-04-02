import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;

        double pass = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String degree = st.nextToken();

            if (degree.equals("A+")) {
                sum += score * 4.5;
                pass += score;
            }
            else if (degree.equals("A0")) {
                sum += score * 4.0;
                pass += score;

            }
            else if (degree.equals("B+")) {
                sum += score * 3.5;
                pass += score;

            }
            else if (degree.equals("B0")) {
                sum += score * 3.0;
                pass += score;

            }
            else if (degree.equals("C+")) {
                sum += score * 2.5;
                pass += score;

            }
            else if (degree.equals("C0")) {
                sum += score * 2.0;
                pass += score;

            }
            else if (degree.equals("D+")) {
                sum += score * 1.5;
                pass += score;

            }
            else if (degree.equals("D0")) {
                sum += score * 1.0;
                pass += score;

            }
            else if (degree.equals("F")) {
                sum += score * 0;
                pass += score;

            }
        }

        double res = sum / pass;

        System.out.printf("%.4f", res);
    }
}