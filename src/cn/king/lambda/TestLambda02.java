package cn.king.lambda;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/25 19:40
 * @title:
 * @description: Lambda表达式中带一个参数
 */

// 使用lambda的时候, 接口必须是函数式接口
interface TestLambdaInter2 {
    void fly(String s);
}

public class TestLambda02 {

    /**
     * 有参数的Lambda表达式
     */
    @Test
    public void fun1() {
        TestLambdaInter2 testLambdaInter2 = (s) -> System.out.println("参数:" + s);

        testLambdaInter2.fly("你好");
    }

    /**
     * 省略参数()的Lambda表达式
     */
    @Test
    public void fun2() {
        TestLambdaInter2 testLambdaInter2 = s -> System.out.println("参数:" + s);

        testLambdaInter2.fly("hello");
    }

    @Test
    public void fun3() {

    }

}
