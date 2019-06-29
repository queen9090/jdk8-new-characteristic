package cn.king.lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/27 15:13
 * @title:
 * @description: 方法引用.
 * 引用类的实例方法.
 */

interface MethodRef00{
    void test(PrintStream out, String str);
}

public class TestLambda07 {

    /*
           定义, 调用接口方法的时候, 需要多一个参数, 并且参数的类型和引用实例方法的类型必须一致.
           把第一个参数作为引用的实例, 后面的每个参数全部传递给引用的方法.
           -- 语法:
           interface <函数式接口>{
                <返回值><方法名>(<类名><名称>[,其他参数...]);
           }
           <函数式接口名> <变量名> = <变量>::<实例方法名>;
           <变量名>.<方法名>(<类名的实例>[,其他参数]);
     */
    // 引用类的实例方法.
    @Test
    public void fun1() {
        MethodRef00 methodRef00 = PrintStream::println;
        // 引用类的实例方法. 第一个参数之后的参数, 作为引用方法的参数.
        // 引用实例方法和引用类方法时, 所有的参数都将作为引用方法的参数.
        // 能根据函数式接口的方法参数, 推断引用的方法的参数的数据类型.
        methodRef00.test(System.out, "参数2");
    }





}
