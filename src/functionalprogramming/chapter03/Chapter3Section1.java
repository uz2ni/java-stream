package functionalprogramming.chapter03;

import functionalprogramming.chapter03.util.Addr;

import java.util.function.Function;

public class Chapter3Section1 {
    public static void main(String[] args) {
        Function<Integer, Integer> myAddr1 = new Addr(); // class
        int result = myAddr1.apply(5);
        System.out.println(result);
    }
}
