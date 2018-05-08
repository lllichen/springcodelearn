package hello;

import java.util.Random;

/**
 * Created by lichen@daojia.com on 2018-1-2.
 */
public class RandomTest {


    public static void main(String[] args) {
        Random random = new Random();
        for (int i =  0 ; i < 10 ; i++)
            System.out.println(random.nextInt( 10 ));
    }
}
