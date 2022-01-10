package functionalprogramming.chapter03.util;

@FunctionalInterface // 인터페이스 구현되지 않은 하나의 메서드 선언만 갖는다 의미 (이미 구현된 것은 상관 없음)
public interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}
