import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i : fivo(N)){
            System.out.print(i + " ");
        }
    }
//// 반복을 사용한 방법
//    private static void fivo(int N) {
//        int a = 1, b = 1;
//        System.out.print(a);
//        for (int i = 2; i <= N; i++) {
//            System.out.print(" " + b);
//            int tmp = a + b; // 앞값 + 뒤값
//            a = b; // 다음 연산에서의 앞값 (f - 2)
//            b = tmp; // 다음 연산에서의 뒷값 (f - 1)
//        }
//    }

/// /재귀를 사용한 방법
//    private static int fivo(int N) {
//        if (N == 0) return 0;
//        if (N == 1) return 1;
//
//        return fivo(N - 1) + fivo(N - 2);
//    }

    private static int[] fivo(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}