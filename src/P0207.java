import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P0207 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    count += ++sum;
            }else sum = 0;
        }

        System.out.println(count);
    }
}
