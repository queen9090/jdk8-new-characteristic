package cn.king.lambda2;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/29 15:10
 * @title:
 * @description:
 */
@FunctionalInterface
interface UserTest1 {
    void test(int i);
}

@FunctionalInterface
interface UserTest2 {
    void test(int i, int j);
}

@FunctionalInterface
interface UserTest3 {
    int test(int i);
}

public class TestLambda02 {
    // 一个参数, 没有返回值
    @Test
    public void fun1() {
        // ()中不需要写参数的数据类型. 将自动根据函数式接口的定义推断参数的类型.
        UserTest1 userTest1 = (i) -> {
            System.out.println(i);
        };
        userTest1.test(100);

        // 如果函数式接口只有一个参数,那么可以省略().
        // 如果方法体只有一句, 能省略{}.
        UserTest1 userTest11 = i -> System.out.println(i);
        userTest1.test(200);
    }

    // 两个参数, 没有返回值
    @Test
    public void fun2() {
        UserTest2 userTest2 = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        userTest2.test(100, 200);
    }

    // 一个参数, 有返回值
    @Test
    public void fun3() {
        UserTest3 userTest3 = x -> {
            x += 10;
            return x;
        };
        int result = userTest3.test(20);
        System.out.println(result);

        // 带返回值并且方法体只有一句, 那么能省略return和{}. (return和{}必须同时省略).
        UserTest3 userTest31 = x -> x += 10;
        int result2 = userTest31.test(20);
    }

}

/*
Lambda是替代匿名内部类的. 但是还是和匿名内部类有区别的.
匿名内部类会生成.class文件, Lambda表达式不会单独生成一个.class文件.
 */

/*
回顾匿名内部类的变量访问原则:

局部变量:
    JDK8开始, 如果在内部类中访问局部变量, 会自动给局部变量加上final修饰符.
    JDK8之前, 内部类只能访问带有final的局部变量.

类变量:
    内部类能直接访问外部类的类变量, 相当于当前类访问当前类的成员变量一样.

实例变量:


 */
