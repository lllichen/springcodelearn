package java8;

import java.util.Optional;
import java.util.function.Function;

/**
 * Created by lichen@daojia.com on 2018-1-4.
 */
public class OptionalTest {

    public void testOf(){
        Optional<String> name = Optional.of("lichen");
//        Optional<String> someNull = Optional.of( null );
        Optional empty = Optional.ofNullable(null);
//        if (name.isPresent())
//            System.out.println(name.get());
//        try{
//            System.out.println(empty.get());
//        }catch (NoSuchElementException ex){
//            System.out.println(ex);
//        }
        name.ifPresent( value -> {
            System.out.println("the length is "+value.length());
        } );

    }

    public String test(Function<String,String> function,String a){
        return function.apply( a );
    }

    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        System.out.println(optionalTest.test( (a)->{a = a + a;return a;}, "aaa" ));
//        optionalTest.testOf();


    }


}
