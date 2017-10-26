package stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by wangyang on 2017/10/26.
 */
public class FibonacciSupplier implements Supplier<Long>{
    long a=0;
    long b=1;
    @Override
    public Long get() {
        long x=a+b;
        a = b;
        b=x;
        return a;
    }
    public static void main(String[] args){
        Stream<Long> fibonacci = Stream.generate(new FibonacciSupplier());
        //取得数列的前10项，用limit(10)
        //fibonacci.limit(10).forEach(System.out::println);
        //取得数列的第20~30项
        fibonacci.skip(20).limit(10).forEach(System.out::println);
    }
}
