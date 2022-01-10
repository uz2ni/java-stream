package functionalprogramming.chapter03;

import java.util.function.BiFunction;

/*
    매개변수 2개 받아서 반환하는 함수 형태
 */
public class Chapter3Section3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> myAddr3 = (x,y) -> x+y;
        int result3 = myAddr3.apply(3,5);
        System.out.println(result3);
    }
}
