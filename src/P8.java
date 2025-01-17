import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String answer = solution(input);
        System.out.println(answer);

    }

    private static String solution(String input) {
        String answer ="NO";
        input = input.toUpperCase().replaceAll("[^A-Z]",""); // replaceAll 메서드는 정규식 사용가능 대문자 A-Z가 아니면 ""로 치환시키는 정규식이다.
        String tmp = new StringBuilder(input).reverse().toString(); // input을 빌더에 넣고 돌린후 스트링으로 바꾼다
        if (input.equals(tmp)) answer = "YES"; // equals를 통해 비교후 같을 경우 YES 아닐 경우 NO로 초기화되있다.
        return answer;
    }
}
