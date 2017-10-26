package stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by wangyang on 2017/10/26.
 */
public class NaturalSupplier implements Supplier<Long> {
    long value = 0;
    @Override
    public Long get() {
       this.value = this.value+1;
       return this.value;
    }
    public static void main(String[] args){
        Stream<Long> natural = Stream.generate(new NaturalSupplier());
        natural.map((x)->{
            return x*x;
        }).limit(10).forEach(System.out::println);
    }
}
