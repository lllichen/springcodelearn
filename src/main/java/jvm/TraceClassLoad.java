package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-13.
 */
public class TraceClassLoad {

    public static void main(String[] args) {
        System.out.println("test");
        try {
            Thread.sleep( 10000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
