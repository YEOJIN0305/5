public class JAVA_TEST {
    public static void main(String[] args) {
        int one = 1;    // 목표가 1단과 2단을 만드는 거였으니까 변수에 1, 2를 넣어준다.
        int two = 2;
        int num = 0;    // 증감연산자를 사용해야하고, 1단 이후에 2단에서는 초기화를 시켜서 다시 써야하기 때문에 초기화 시킬 변수도 하나 만든다.

        System.out.println(one + " 단");
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);
        System.out.println(one * ++num);

        num = 0;

        System.out.println(two + " 단");
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);
        System.out.println(two * ++num);

        System.out.printf("%d", two * ++num);

    }
}