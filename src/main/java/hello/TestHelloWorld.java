package hello;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * Created by lichen@daojia.com on 2017-10-24.
 */
public class TestHelloWorld {

    /**
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // TODO Auto-generated method stub

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myLearn.xml");
//        HelloWorld bean = (HelloWorld)applicationContext.getBean("helloWorld");
//        bean.say();
        Object obj = Class.forName("hello.User").newInstance();//实例化 User 类
        BeanWrapper bw = new BeanWrapperImpl(obj);//把 User 对象放入 BeanWrapper
        bw.setPropertyValue("name", "Erica");//为 User 对象的属性设值
        System.out.println("User name=>"+bw.getPropertyValue("name"));
    }

}
class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
