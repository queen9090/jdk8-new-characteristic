package cn.king.lambda;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/25 19:56
 * @title:
 * @description: 带返回值的Lambda表达式.
 */

@FunctionalInterface
interface LambdaReturnInter {
    int test();
}

class TestLambdaReturn {
    public void result(LambdaReturnInter lambdaReturnInter) {
        int i = lambdaReturnInter.test();
        System.out.println("返回的值是: " + i);
    }
}

public class TestLambda05 {
    @Test
    public void fun1() {
        TestLambdaReturn testLambdaReturn = new TestLambdaReturn();
        testLambdaReturn.result(() -> {
            return 100;
        });
    }

    @Test
    public void fun2() {
        TestLambdaReturn testLambdaReturn = new TestLambdaReturn();
        //如果需要return, 但是执行语句只有一句, 可以省略{}, 但是必须同时省略return关键字
        testLambdaReturn.result(() -> 100);
    }

    // 我们可以返回变量
    @Test
    public void fun3() {
        int j = 1234;
        TestLambdaReturn testLambdaReturn = new TestLambdaReturn();
        testLambdaReturn.result(() -> {
            return j;
        });
        int k = 1000;
        testLambdaReturn.result(() -> k);

        /*
        注意:
            在匿名内部类中, j和k都会加上final, JDK8以前,  需要手动加final,
            JDK8以后, 编译器自动加上final.
            上述的Lambda表达式中, j和k将被自动加上final, 因此上述的j和k是不能重新赋值的

            Lambda表达式和匿名内部类一样, 如果访问局部变量, 要求局部变量必须是final的.
         */
    }


}
