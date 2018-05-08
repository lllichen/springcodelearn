package pool;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by lichen@daojia.com on 2018-4-18.
 */
public class TestBolckQueue {

    private static final ArrayBlockingQueue<Integer> arrayList = new ArrayBlockingQueue<Integer>( 10 );


    public static void testAdd(){
        arrayList.add( 1);
        arrayList.add( 2);
        arrayList.add( 3);
        arrayList.add( 4);
        arrayList.add( 5);
        arrayList.add( 6);
        arrayList.add( 7);
        arrayList.add( 8);
        arrayList.add( 9);
        arrayList.add( 10);
        arrayList.add( 11);
        arrayList.add( 12);
    }

    public static void testPut() throws InterruptedException {
        arrayList.put( 1);
        arrayList.put( 2);
        arrayList.put( 3);
        arrayList.put( 4);
        arrayList.put( 5);
        arrayList.put( 6);
        arrayList.put( 7);
        arrayList.put( 8);
        arrayList.put( 9);
        arrayList.put( 10);
        arrayList.put( 11);
        arrayList.put( 12);
    }



    public static void main(String[] args) throws InterruptedException {
//        testAdd();
        testPut();

    }

}
