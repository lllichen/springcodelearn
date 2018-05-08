package aop;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by lichen@daojia.com on 2017-11-3.
 */
public class MethodCounter implements Serializable{

    private HashMap<String, Integer> map = new HashMap<>(  );

    private int allCount;

    protected void count(Method m){
        count( m.getName() );
    }

    protected void count(String methodName){
        Integer i = map.get( methodName );
        i = ( i != null ) ? new Integer( i.intValue()+1 ) : new Integer( 1 );
        map.put( methodName, i );
        ++allCount;
    }

    public int getCalls(String methodName){
        Integer i = map.get( methodName );
        return i != null ? i.intValue() : 0;
    }

    public int getCalls(){
        return  allCount;
    }

    public boolean equals(Object other){
        return (other != null && other.getClass() == this.getClass());
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
