package asm;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lichen@daojia.com on 2017-10-31.
 */
public class Test {

    public static void main(String[] args) throws IOException {

        ClassWriter cw = new ClassWriter(0 );
        cw.visit( Opcodes.V1_5,Opcodes.ACC_PUBLIC+Opcodes.ACC_ABSTRACT+Opcodes.ACC_INTERFACE,"com/asm3/Comparable", null, "java/lang/Object", new String[]{"com/asm3/Mesurable"});
        cw.visitField(Opcodes.ACC_PUBLIC+Opcodes.ACC_FINAL+Opcodes.ACC_STATIC, "LESS", "I", null, new Integer(-1)).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC+Opcodes.ACC_FINAL+Opcodes.ACC_STATIC, "EQUAL", "I", null, new Integer(0)).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC+Opcodes.ACC_FINAL+Opcodes.ACC_STATIC,"GREATER", "I", null, new Integer(1)).visitEnd();
        cw.visitMethod(Opcodes.ACC_PUBLIC+Opcodes.ACC_ABSTRACT, "compareTo","(Ljava/lang/Object;)I", null, null).visitEnd();
        cw.visitEnd(); //使cw类已经完成
        byte[] data = cw.toByteArray();
        File file = new File("D://Comparable.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }
}
