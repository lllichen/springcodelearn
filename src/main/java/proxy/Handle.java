package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lichen@daojia.com on 2017-11-8.
 */
public class Handle implements InvocationHandler{

    private Echo object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("echo before");
        method.invoke( object,args );
        System.out.println("echo after");
        return null;
    }


    public Handle setObject(Echo object) {
        this.object = object;
        return this;
    }
}
