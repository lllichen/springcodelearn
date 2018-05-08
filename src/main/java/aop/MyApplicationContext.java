package aop;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Created by lichen@daojia.com on 2017-11-21.
 */
public class MyApplicationContext extends AbstractXmlApplicationContext {


    public MyApplicationContext(){

    }

    public MyApplicationContext(ApplicationContext parent){
        super(parent);
    }

    public MyApplicationContext(String configLocation) throws BeansException {
        this(new String[] {configLocation}, true, null);
    }

    public MyApplicationContext(String... configLocations) throws BeansException {
        this(configLocations, true, null);
    }

    public MyApplicationContext(String[] configLocations, ApplicationContext parent) throws BeansException {
        this(configLocations, true, parent);
    }

    public MyApplicationContext(String[] configLocations, boolean refresh) throws BeansException {
        this(configLocations, refresh, null);
    }

    public MyApplicationContext(String[] configLocations, boolean refresh, ApplicationContext parent) throws BeansException{
        super(parent);
        setConfigLocations(configLocations);
        if (refresh) {
            refresh();
        }
    }

    @Override
    protected Resource getResourceByPath(String path) {
        return super.getResourceByPath( path );
    }
}
