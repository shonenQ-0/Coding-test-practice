import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solve(N));
    }

    private static int solve(int N) {
        int answer = 0;
        boolean[] visited = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            visited[i] = true;
        }

        for (int i = 2; i*i <= N; i++) {
            if (visited[i]) {
                for (int j = i * i; j <= N; j += i) {
                    visited[j] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (visited[i]) {
                answer++;
            }
        }
        return answer;
    }
}
