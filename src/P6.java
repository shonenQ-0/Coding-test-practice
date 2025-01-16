import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String answer = solution(input);
        System.out.println(answer);
    }

    private static String solution(String input) {
//        String result = "";
//        HashSet<Character> set = new LinkedHashSet<>();
//        for (char c : input.toCharArray()){
//            set.add(c);
//        }
//        for (char x : set){
//            result += x;
//        }
//        return result;
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) answer += input.charAt(i);
        }
        return answer;

    }
}
