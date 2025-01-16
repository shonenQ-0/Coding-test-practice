import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String answer = solution(input);
        System.out.println(answer);
    }

    private static String solution(String input) {
        char[] charArray = input.toCharArray();
        int lp = 0;
        int rp = input.length() - 1;
        while(lp < rp){
            if (!Character.isAlphabetic(charArray[lp])) lp++;
            else if (!Character.isAlphabetic(charArray[rp])) rp--;
            else {
                char tmp = charArray[lp];
                charArray[lp] = charArray[rp];
                charArray[rp] = tmp;
                lp++;
                rp--;
            }

        }
        return String.valueOf(charArray);
    }
}
