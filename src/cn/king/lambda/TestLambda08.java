package cn.king.lambda;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/29 14:32
 * @title:
 * @description: 方法引用
 * 构造器引用
 */

interface MethodRef4 {
    String test(char[] chars);
}

public class TestLambda08 {

    // 使用构造器引用
    @Test
    public void fun1() {
        // 引用构造器, 根据函数式接口的方法名来推断引用哪个构造器.
        MethodRef4 methodRef4 = String::new;
        String s = methodRef4.test(new char[]{'你', '好'});
        System.out.println(s);
    }

    // 不适用构造器引用. fun2和fun1的功能是相同的.
    @Test
    public void fun2() {
        MethodRef4 methodRef4 = (c) -> {
            String s = new String(c);
            return s;
        };

        methodRef4.test(new char[]{'你', '好'});
    }

}
