#문자열 붙여서 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String answer = a + b;
        answer = answer.replace(" ","");
        System.out.print(answer);
    }
}
