import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            solve(st.nextToken());
        }
    }
    private static void solve(String s){
        StringBuilder sb = new StringBuilder(s);
        int n = Integer.parseInt(sb.reverse().toString());

        int[] era = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            era[i] = 1;
        }

        for (int i = 2; i*i <= n ; i++) {
            if (era[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    era[j] = 0;
                }
            }
        }

        if (era[n] == 1) {
            System.out.print(n + " ");
        }
    }
}
