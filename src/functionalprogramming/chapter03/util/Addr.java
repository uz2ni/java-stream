package functionalprogramming.chapter03.util;

import java.util.function.Function;
/*
    Function 인터페이스를 구현해 함수를 오브젝트 형식으로 만든다.
 */
public class Addr implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer x) {
        return x+10;
    }
}
