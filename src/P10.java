import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        char c = st.nextToken().charAt(0);

        for (int i : solution(s, c)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String s, char c) {
        int[] n = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                p = 0;
                n[i] = p;
            } else {
                p++;
                n[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                n[i] = Math.min(p, n[i]);
            }
        }
        return n;
    }
}
