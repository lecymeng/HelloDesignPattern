package design.pattern.structure.proxy.sample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 动态代理类
 */
public class DynamicProxy implements InvocationHandler {
  // 被代理类的引用
  private Object mObject;

  public DynamicProxy(Object o) {
    mObject = o;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(mObject, args);
  }
}
