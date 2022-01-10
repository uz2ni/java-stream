package functionalprogramming.chapter03;

import functionalprogramming.chapter03.util.TriFunction;

/*
    직접 만든 TriFunction 함수 객체를 이용해 람다식 표현
 */
public class Chapter3Section4 {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> myAddr4 = (x,y,z) -> x+y+z;
        int result4 = myAddr4.apply(1,2,3);
        System.out.println(result4);
    }
}
