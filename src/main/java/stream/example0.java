package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * http://www.infoq.com/cn/articles/java8-new-features-new-stream-api
 */
public class example0 {
    private static final int INITIAL_CAPACITY = 10;
    public static void main(String[] args){
        useStream();
        useNormal();
    }

    public static void useStream(){
    long startTime = System.currentTimeMillis();
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = new ArrayList<>(INITIAL_CAPACITY);
        for(int i=0;i<INITIAL_CAPACITY;i++){
            numbers.add(i);
        }
    Stream<Integer> stream = numbers.stream();
        stream.filter((x) -> {
        return x % 2 == 0;
    }).map((x) -> {
        return x * x;
    });
    long endTime = System.currentTimeMillis();
    System.out.println("运行时间:"+(endTime-startTime)+"毫秒");
    }

    public static void useNormal(){
        long startTime = System.currentTimeMillis();
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = new ArrayList<>(INITIAL_CAPACITY);
        for(int i=0;i<INITIAL_CAPACITY;i++){
            numbers.add(i);
        }
        for(Integer number:numbers){
            if(number % 2 == 0){
//                System.out.println(number*number);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:"+(endTime-startTime)+"毫秒");
    }

}
