import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));

    }

    private static String solution(String input) {

        char[] arr = input.toUpperCase().toCharArray();
        int lp = 0;
        int rp = arr.length - 1;
        while(lp < rp){
            if (arr[lp] != arr[rp]){
                return "NO";
            }
            lp++;
            rp--;
        }
        return "YES";
    }
}
