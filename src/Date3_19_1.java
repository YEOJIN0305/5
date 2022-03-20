public class Date3_19_1 {
    public static void main(String[] args) {
        int thr = 3;
        int fou = 4;
        int num = 0;

        System.out.println(thr + "단");
        System.out.println(thr + " X " + ++num + " = " + thr * num); //변수가 아닌 문자는 ""로 출력해야한다    변수를 포함한 모든 문자사이에는 +가 있어야한다.
        //System.out.printf("%d X %d = %d", thr, ++num, thr * num);
    }

}