package string;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by lichen@daojia.com on 2017-12-11.
 */
public class StringCode extends Thread{



//    public static void main(String[] args) throws InterruptedException {
//        long begin = System.currentTimeMillis();
//        final CountDownLatch countDownLatch = new CountDownLatch(1000);
//        for (int i = 0 ; i < 1000 ; i++){
//            Thread thread = new Thread( ()-> {System.out.println(111);countDownLatch.countDown();});
//            thread.start();
//        }
//
//        long end = System.currentTimeMillis();
//        countDownLatch.await();
//
//        System.out.println((end-begin) + "ms");
//    }


//    public static void main(String[] args) throws InterruptedException {
//        long time1 = System.currentTimeMillis();
//
//        List<Thread> threads = new ArrayList<Thread>();
//
//        for(int i=0;i<1000;i++) {
//            Thread t = new Thread(()-> System.out.println(111));
//            t.run();
//            threads.add(t);
//        }
//
//        for(Thread t : threads) {
//            t.join(); // 用join()等待所有的线程。先后顺序无所谓，当这段执行完，肯定所有线程都结束了。
//        }
//
//        long time2 = System.currentTimeMillis();
//
//        System.out.println(time2-time1);
//    }

    volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        long time1 = System.currentTimeMillis();

        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(1000 );

        for ( int i = 0; i < 1000 ; i ++){
            blockingQueue.put( () -> System.out.println( 111 ) );
        }

        Thread t1 = new Thread( ()->{
            try {

               while(true && flag){
                   Runnable runnable = blockingQueue.take();
                   runnable.run();
                   if(blockingQueue.size() == 0){
                       flag = false;
                   }
                   System.out.println(currentThread().getName());
               }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } );
        System.out.println("begin");
        t1.start();

        Thread t2 = new Thread( ()->{
            try {
                while(true && flag ){
                    Runnable runnable = blockingQueue.take();
                    runnable.run();
                    System.out.println(currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } );
        t2.start();

        t1.join();
        t2.join();

        long time2 = System.currentTimeMillis();

        System.out.println(time2-time1);
    }
}
