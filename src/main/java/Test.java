import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by lichen@daojia.com on 2017-7-5.
 */
public class Test{


    public static void main(String[] args) {
        Stream.of( 1,2,3,4,5,5,5,6,6,6).distinct().collect( toList() ).forEach(System.out::println );

    }

}
