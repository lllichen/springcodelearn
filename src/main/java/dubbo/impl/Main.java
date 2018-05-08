package dubbo.impl;

import dubbo.HelloService;

import java.util.ServiceLoader;

/**
 * Created by lichen@daojia.com on 2018-4-24.
 */
public class Main {


    public static void main(String[] args) {
        ServiceLoader<HelloService> helloServiceLoader=ServiceLoader.load(HelloService.class);
        for (HelloService item : helloServiceLoader){
            item.hello();
        }
    }
}
