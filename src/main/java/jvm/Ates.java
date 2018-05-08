package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-1.
 */
public class Ates {

    public  static void printArgs(String [] args){
        for (int i =0 ; i < args.length ; i++)
            System.out.println("参数"+(i+1)+":"+args[i]);
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
    }

    public static class User {
        public int id = 0;
        public String name = "";
    }

    public static void alloc(){
        User u = new User();
        u.id=5;
        u.name = "geym";
    }

    public static void main(String[] args) {
        printArgs( args );
        long b = System.currentTimeMillis();
        for(int i = 0 ; i < 100000000;i++)
            alloc();
        long e = System.currentTimeMillis();
        System.out.println(e-b);

    }

}
