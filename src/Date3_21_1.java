import java.util.Scanner;//반복문으로 숫자 입력받아서 숫자에 맞는 구구단 출력

public class Date3_21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단 : ");
        int dan = sc.nextInt(); //숫자니까 Int
        System.out.println(dan + "단");//printf가 아닐시 무조건 중간중간 +와 문자에는 ""
        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + "x" + i + "=" + (dan * i));
        }
    }
}
