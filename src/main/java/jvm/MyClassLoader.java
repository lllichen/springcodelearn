package jvm;

/**
 * Created by lichen@daojia.com on 2017-12-27.
 */
public class MyClassLoader extends ClassLoader{

    private String fileName;

    public MyClassLoader(String fileName){
        this.fileName = fileName;
    }

    protected Class<?> findClass(String className) throws ClassNotFoundException{
        Class clazz = this.findLoadedClass( className );
        if (null == clazz){
//            try{
//                String classFile = getClassFile(className );
//            }
        }
        return null;
    }
}
