package dubbo.impl;

import dubbo.HelloService;

/**
 * Created by lichen@daojia.com on 2018-4-24.
 */
public class CustomHelloService implements HelloService{
    @Override
    public void hello() {
        System.out.println("Custom");
    }
}
