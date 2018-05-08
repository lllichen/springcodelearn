package asm;

/**
 * Created by lichen@daojia.com on 2017-10-31.
 */
public class TestTimer {

    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        C c = new C();
        c.m();
        Class cc = c.getClass();
        System.out.println(cc.getField("timer").get(c));
    }
}
