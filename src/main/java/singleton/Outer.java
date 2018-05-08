package singleton;

/**
 * Created by lichen@daojia.com on 2017-12-26.
 */
public class Outer {

    private int a = 1;

    private Inner inner = new Inner();

    private void say(){
        Inner inner = new Inner();
        inner.say();
    }

    private class Inner{

        public void say(){
            int b = a;
            System.out.println("i'm inner"+a);
        }
    }

}
