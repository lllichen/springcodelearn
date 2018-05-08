package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lichen@daojia.com on 2018-5-7.
 */
public class Log4j {

    static Logger logger = LoggerFactory.getLogger( Log4j.class );

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0 ; i < Integer.MAX_VALUE; i++){
            logger.info( "info" );
            Thread.sleep( 10000 );
            logger.error( "test" );
        }

        System.out.println(logger.isDebugEnabled());
        System.out.println(logger.isInfoEnabled());
        System.out.println(logger.isErrorEnabled());
        System.out.println(logger.isTraceEnabled());
        System.out.println(logger.isWarnEnabled());

    }
}
