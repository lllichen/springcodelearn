package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-26.
 */
public class StaticA {
    static {
        try{
            Thread.sleep( 1000 );
        }catch (InterruptedException e){

        }
        try{
            Class.forName( "jvm.StaticB" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("StaticA init OK");
    }
}
