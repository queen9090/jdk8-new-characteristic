package cn.king.lambda2;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/29 15:02
 * @title:
 * @description:
 */
public class TestLambda01 {
    // 匿名内部类的方式. JDK8之前, 没有Lambda表达式, 只能使用匿名内部类.
    @Test
    public void fun1() {
        UserTest userTest = new UserTest() {
            @Override
            public void test() {
                System.out.println("使用匿名内部类实现. ");
            }
        };
        userTest.test();
    }

    // Lambda表达式的方式.
    @Test
    public void fun2() {
        UserTest userTest = () -> {
            System.out.println("使用Lambda表达式实现");
        };
        userTest.test();
    }

    // 如果方法体只有一句话, 可以省略"{ }", 以及省略一个";".
    @Test
    public void fun3() {
        UserTest userTest = () -> System.out.println("使用Lambda表达式实现");
        userTest.test();
    }

}

@FunctionalInterface
interface UserTest{
    void test();
}
