package singleton;

/**
 * Created by lichen@daojia.com on 2017-12-26.
 */
public class Singleton {

    static {
        System.out.println("init");
    }

    private static class Holder {
        private static Singleton singleton = new Singleton();

    }

    private Singleton(){}

    public static Singleton getSingleton(){
        System.out.println(111);
        return Holder.singleton;
    }

    public static void main(String[] args) {
        Singleton.getSingleton();
    }

}
