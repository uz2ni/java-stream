package functionalprogramming.chapter03;

import java.util.function.Function;

/*
    매개변수 1개 받아서 반환하는 함수 형태
 */
public class Chapter3Section2 {
    public static void main(String[] args) {
        Function<Integer, Integer> myAddr2 = x -> x + 10; // rambda expression
        int result2 = myAddr2.apply(5);
        System.out.println(result2);
    }
}
