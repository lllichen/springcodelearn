package asm;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by lichen@daojia.com on 2017-12-23.
 */
public class AsmHelloWorld extends ClassLoader implements Opcodes{

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ClassWriter cw = new ClassWriter( ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES );
        cw.visit( V1_7,ACC_PUBLIC,"Example",null,"java/lang/Object",null );
        MethodVisitor mw = cw.visitMethod( ACC_PUBLIC,"<init>","()V",null,null );
        mw.visitVarInsn(ALOAD,0 );
        mw.visitMethodInsn( INVOKESPECIAL,"java/lang/Object","<init>","()V" );
        mw.visitInsn( RETURN );
        mw.visitMaxs( 0,0 );
        mw.visitEnd();

        mw = cw.visitMethod( ACC_PUBLIC+ACC_STATIC,"main","([Ljava/lang/String;)V",null,null );
        mw.visitFieldInsn(  GETSTATIC,"java/lang/System","out","Ljava/io/PrintStream;");
        mw.visitLdcInsn( "Hello,World" );
        mw.visitMethodInsn( INVOKEVIRTUAL,"java/io/PrintStream","println","(Ljava/lang/String;)V");
        mw.visitInsn(RETURN);
        mw.visitMaxs( 0,0 );
        mw.visitEnd();
        byte[] code = cw.toByteArray();
        AsmHelloWorld asmHelloWorld = new AsmHelloWorld();
        Class example = asmHelloWorld.defineClass( "Example",code,0,code.length );
        example.getMethods()[0].invoke( null,new Object[]{null} );
    }

}
