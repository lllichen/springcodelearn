package lamada;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by lichen@daojia.com on 2018-3-7.
 */
public class Sample {

    public static void main(String[] args) {

        Stream.of(1,2,3,4).max( Comparator.comparing( x -> x >1 ));

    }
}
