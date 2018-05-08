package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2017-11-8.
 */
public class Main {


    public static void main(String[] args) {
//        Chinese chinese = new Chinese();
//
//        Method[] methods = chinese.getClass().getMethods();
//        for (Method method : methods){
//            System.out.println(method.getName());
//        }

        List<String> list= new ArrayList<>(  );
        list.add( null );
        System.out.println(list.size());


//        Class<?> [] classes = new Class[]{Echo.class};
//        Echo  echo = (Echo) Proxy.newProxyInstance(Chinese.class.getClassLoader(),classes,new Handle().setObject( chinese ));
//        echo.echo();
    }
}
