package cn.king.lambda;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/26 11:02
 * @title:
 * @description: 方法引用.
 * 引用实例方法和类方法.
 */

interface MethodRef {
    void test(String s);
}

interface MethodRef1 {
    void test(int[] arr);
}

public class TestLambda06 {

    // 不使用引用方法输出字符串
    @Test
    public void fun1() {
        MethodRef methodRef = (s) -> System.out.println(s);
        methodRef.test("这是字符串");
    }

    // 使用引用方法输出字符串
    @Test
    public void fun2() {
        // 使用 方法引用; 引用实例方法; System.out本身就是一个对象, 引用这个对象的println方法.
        // 引用实例方法, 将会自动把调用方法的时候的全部参数, 全部传给引用的方法.
        // <函数式接口> <变量名> = <实例>::<实例方法名>;
        MethodRef methodRef = System.out::println;
        // <变量名>.<函数式接口方法名>([实参]);
        // 自动把[实参]全部传递给引用的实例方法.
        methodRef.test("这是字符串. 使用方法引用");
    }

    // 不使用引用方法进行排序
    @Test
    public void fun3() {
        MethodRef1 methodRef = (arr) -> Arrays.sort(arr);
        int[] a = {3, 45, 87, 1, 32};
        methodRef.test(a);
    }

    // 使用引用方法进行排序
    // 使用lambda表达式引用类方法.
    @Test
    public void fun4() {
        //引用类方法, 将会自动把调用方法的时候的全部参数, 全部传给引用的方法.
        // 使用方法引用, 能根据函数式接口的方法的参数, 推断引用的方法的参数类型.
        // 方法引用只适用于逻辑代码只有一行的情况, 实际工作中用的不多.
        //<函数式接口> <变量名> = <类名>::<类方法名>;
        MethodRef1 methodRef = Arrays::sort;
        // <变量名>.<函数式接口方法名>([实参]);
        // 自动把[实参]全部传递给引用的类方法.
        int[] a = {3, 45, 87, 1, 32};
        // 引用方法排序
        methodRef.test(a);
    }


}
