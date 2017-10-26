package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyang on 2017/10/26.
 */
public class CollectionUtils {


    public static void main(String[] args) {
        List input = Arrays.asList(new String[] {"apple", "orange", "pear"});
        input.forEach((v) -> System.out.println(v));
        input.forEach(System.out::println);
    }
}
