package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-1.
 */
public class SimpleArgs {

    public  static void printArgs(String [] args){
        for (int i =0 ; i < args.length ; i++)
            System.out.println("参数"+(i+1)+":"+args[i]);
        System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
    }

    public static int count = 0;

    public static void recursion(){
        count++;
        recursion();
    }

// test xss
//    try {
//        recursion();
//    }catch (Throwable e){
//        System.out.println("deep of calling = " + count);
//        e.printStackTrace();
//    }

    public void localvarCcl(){
        byte[] a = new byte[6*1024*1024];
        System.gc();
    }

    public void localvarCc2(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvarCc3(){
        byte[] a = new byte[6*1024*1024];
        a=null;
        System.gc();
    }


    public static void main(String[] args) {
        printArgs( args );
        SimpleArgs simpleArgs = new SimpleArgs();
        simpleArgs.localvarCcl();
        simpleArgs.localvarCc2();
        simpleArgs.localvarCc3();

    }

}
