import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String ans = "";
        s = s += " ";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            }else {
                ans += s.charAt(i);
                if (cnt > 1) ans += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return ans;
    }
}
