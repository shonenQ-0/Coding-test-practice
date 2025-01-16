import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.println(solution(s));
        }
    }

    private static String solution(String s) {
        String answer = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            answer += s.charAt(i);
        }

        return answer;
    }
}
