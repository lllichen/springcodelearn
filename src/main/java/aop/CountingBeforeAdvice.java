package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lichen@daojia.com on 2017-11-3.
 */
public class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        count( method );
    }
}
