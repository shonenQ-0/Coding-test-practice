import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));

    }

    private static String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        for (String e : split){
            if (e.length() > answer.length()) answer = e;
        }
        return answer;
    }
}
