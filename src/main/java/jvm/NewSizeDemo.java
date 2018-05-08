package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-13.
 */
public class NewSizeDemo {

    public static void main(String[] args) {
        byte[] b = null;
        for (int i = 0 ;i < 10; i++)
            b = new byte[1*1024*1024];
    }
}
