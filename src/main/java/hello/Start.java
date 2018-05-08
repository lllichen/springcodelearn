package hello;


import org.springframework.lang.Nullable;

import java.util.Optional;

/**
 * Created by lichen@daojia.com on 2017-8-7.
 */
public class Start {

    @Nullable
    public String name;

    public static void main(String[] args) {
//
//        ClassPathResource res = new ClassPathResource("myLearn.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(res);
//        System.out.println(factory.getBeanDefinitionCount());
//        for(String name : factory.getBeanDefinitionNames()){
//            System.out.println(name);
//        }
//        factory.getBean( "messagePrinter" );
//
//        MessagePrinter messagePrinter = (MessagePrinter)factory.getBean("messagePrinter");
//        messagePrinter.printMessage();
        Optional<String> optional = Optional.empty();
        System.out.println(optional.map( u-> u.toString() ).orElse(  null ));


//        factory.

//         Start start = new Start();
//
//        Method method =  (this.pd instanceof GenericTypeAwarePropertyDescriptor ?
//                ((GenericTypeAwarePropertyDescriptor) this.pd).getWriteMethodForActualAccess() :
//                this.pd.getWriteMethod());


    }

}
