import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        s = s.toLowerCase().replaceAll("[a-z]","");
        return Integer.parseInt(s);
    }
}
