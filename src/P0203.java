import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0203 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str.nextToken());
        }

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(str.nextToken());
        }
        solve(N, A, B);
    }
    private static void solve(int N, int[] A, int[] B) {
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                System.out.println("D"); // 비긴 조건
            } else if (A[i] == 1 && B[i] == 3 // A가 승리하는 모든 조건
                    || A[i] == 2 && B[i] == 1
                    || A[i] == 3 && B[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }

        }
    }
}
