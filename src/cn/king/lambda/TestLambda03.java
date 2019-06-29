package cn.king.lambda;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/25 19:43
 * @title:
 * @description: Lambda表达式中带多个参数
 */

// 使用lambda的时候, 接口必须是函数式接口
interface TestLambdaInter3 {
    void fly(String s, Integer i);
}

public class TestLambda03 {

    /**
     * 有两个参数的Lambda
     */
    @Test
    public void fun1() {
        TestLambdaInter3 testLambdaInter3 = (s, i) -> System.out.println("参数:" + s + "," + i);

        testLambdaInter3.fly("你好", 100);
    }

    @Test
    public void fun2() {

    }

}
