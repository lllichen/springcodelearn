package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-26.
 */
public class StaticB {
    static {
        try{
            Thread.sleep( 1000 );
        }catch (InterruptedException e){

        }
        try{
            Class.forName( "jvm.StaticA" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("StaticB init OK");
    }
}
