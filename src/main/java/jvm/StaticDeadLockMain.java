package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-26.
 */
public class StaticDeadLockMain extends Thread{
    private char flag;

    public StaticDeadLockMain(char flag){
        this.flag = flag;
        this.setName( "Thread"+flag );
    }

    @Override
    public void run(){
        try{
            Class.forName( "jvm.Static"+flag );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+" over");
    }

    public static void main(String[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain( 'A' );
        loadA.start();
        StaticDeadLockMain loadB = new StaticDeadLockMain( 'B' );
        loadB.start();
    }
}
