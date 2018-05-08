package hello;

/**
 * Created by lichen@daojia.com on 2017-6-9.
 */
public interface MessageService {
    String getMessage();

    default String getMessage2(){
        return "00";
    }
}
