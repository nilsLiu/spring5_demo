package com.example.spring5_AOP.JDK_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.JDK_Proxy
 * @Author: hai
 * @CreateTime: 2023-03-17  15:12
 * @Version: 1.0
 */

public class JDKProxy {
    static Class[] interfaces = {UserDao.class};

    public static void main(String[] args) {

        UserDaoImpl userDao = new UserDaoImpl();
        //创建接口实现类的代理对象
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(2, 3);
        System.out.println("result:" + result);
    }
}

//创建代理对象
class UserDaoProxy implements InvocationHandler {
    //1.把创建的是谁的代理对象，把谁传递进来
    //有参构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("在方法之前执行" + method.getName() + "---传递的参数：" + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行" + obj);
        return res;
    }
}
