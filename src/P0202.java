import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P0202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        solve(list);

    }
    private static void solve(ArrayList<Integer> list) {
        int tmp = 0; //// 입력에 음수가 없기 때문에 0으로 초기화 해도 될 듯
        int count = 0;
        for (int i : list) {
            if (i > tmp) {
                count++;
                tmp = i;
            }
        }
        System.out.println(count);
    }
}
