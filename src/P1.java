import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(solution(s, c));
    }

    private static int solution(String s, char c) {
        s = s.toLowerCase();
        c = Character.toLowerCase(c);
        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == c) count++;
//        }
        for (char x : s.toCharArray()){
            if (x == c) count ++;
        }
        return count;
    }
}

