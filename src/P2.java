import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] solution = solution(s);
        for (char x : solution){
            System.out.print(x);
        }

    }

    private static char[] solution(String s) {
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                charArray[i] = Character.toLowerCase(s.charAt(i));
            else charArray[i] = Character.toUpperCase(s.charAt(i));
        }
        return charArray;
    }


}
