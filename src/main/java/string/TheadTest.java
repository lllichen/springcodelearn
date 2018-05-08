package string;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lichen@daojia.com on 2018-3-28.
 */
public class TheadTest {




    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit( ()-> System.out.println(111) );
        executorService.shutdown();
    }
}
