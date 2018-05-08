package pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lichen@daojia.com on 2018-4-18.
 */
public class ThreadPool {

    private static final ArrayBlockingQueue<Runnable> arrayList = new ArrayBlockingQueue<Runnable>( 10 );

    private static int maxNum = 10;

    private static AtomicInteger threadNum = new AtomicInteger( 0 );



    public static void main(String[] args) throws InterruptedException {

        while (threadNum.get() <= maxNum){
            Thread thread = new Thread( ()->{
                try {
                    while (true){
                        Runnable runnable = arrayList.take();
                        runnable.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });

            thread.start();
            System.out.println(threadNum.getAndAdd( 1 ));

        }

        for (int i = 0 ; i < 1000 ; i++){
            int finalI = i;
            arrayList.put( ()->{
                try {
                    Thread.sleep( 1000 );
                    System.out.println("the "+ finalI +" task, "+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } );
        }
    }
}
