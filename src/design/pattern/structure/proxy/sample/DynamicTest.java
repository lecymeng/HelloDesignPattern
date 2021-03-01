package design.pattern.structure.proxy.sample;

import java.lang.reflect.Proxy;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 动态代理测试
 */
public class DynamicTest {
  public static void main(String[] args) {
    //构造出诉讼人小民
    ILawsuit weicools = new Weicools();

    //1.静态代理
    //构造一个代理律师，并将小民传递进去
    //ILawsuit lawyer = new Lawyer(xiaomin);

    //2.动态代理
    //构造一个动态代理
    DynamicProxy proxy = new DynamicProxy(weicools);

    //获取被代理类小民的ClassLoader
    ClassLoader loader = weicools.getClass().getClassLoader();

    //动态构造一个代理者律师
    ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[] { ILawsuit.class }, proxy);

    //律师提交申请
    lawyer.submit();

    //律师进行举证
    lawyer.burden();

    //律师代替weicools辩护
    lawyer.defend();

    //完成诉讼
    lawyer.finish();
  }
}
