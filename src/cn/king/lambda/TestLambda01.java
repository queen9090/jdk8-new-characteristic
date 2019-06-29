package cn.king.lambda;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/25 19:29
 * @title:
 * @description: Lambda表达式代替匿名内部类, 最基本的使用
 */

// 使用lambda的时候, 接口必须是函数式接口
interface TestLambdaInter {
    void fly();
}

public class TestLambda01 {

    /**
     * 使用匿名内部类
     */
    @Test
    public void fun1() {
        TestLambdaInter testLambdaInter1 = new TestLambdaInter() {
            @Override
            public void fly() {
                System.out.println("使用匿名内部类实现的抽象方法");
            }
        };

        testLambdaInter1.fly();
    }

    /**
     * 使用Lambda
     */
    @Test
    public void fun2() {
        TestLambdaInter testLambdaInter2 = () -> {
            System.out.println("使用lambda实现的抽象方法");
        };

        testLambdaInter2.fly();
    }

    @Test
    public void fun3() {
        TestLambdaInter testLambdaInter2 = () -> System.out.println("使用lambda实现的抽象方法,省略{ }");

        testLambdaInter2.fly();
    }

    /*
    Lambda语法:

    ([形参列表, 不带数据类型]) -> {
        // 执行语句
        [return ...;]
    }

    注意:
        1. 如果形参列表是空的, 只需要写()即可.
        2. 没有返回值, 不需要写return语句.
        3. 如果函数式接口的抽象方法只有一个形参, ()可以省略, 只需要写参数的名称即可.
        4. 如果函数式接口的抽象方法不只有一个形参, ()不能省略.
        5. 形参列表的数据类型自动推断, 我们不用写.
        6. 如果执行语句只有一行, 可以省略{ }, 但是有返回值的时候不能省略{ }. (说的不完全, 需要结合下一句)
        7. 如果执行语句只有一句, 并且有返回值,可以省略{}, 但是必须同时省略return关键字,
           有return时, 不建议省略{}和return关键字.
        8. Lambda表达式和匿名内部类一样, 如果访问局部变量, 要求局部变量必须是final的.

     */


}




