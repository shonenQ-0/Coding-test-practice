import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        for (char c : solve(input, n)) {
            System.out.print(c);
        }

    }

    private static char[] solve(String input, int n){
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[n];

        for (char c : input.toCharArray()) {
            sb.append(c == '#' ? 1 : 0);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            String substring = sb.substring(index, index + 7);
            int decimal = Integer.parseInt(substring, 2);
            arr[i] = (char) decimal;
            index += 7;
        }
        return arr;
    }
}
