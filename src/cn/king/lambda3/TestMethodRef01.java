package cn.king.lambda3;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/29 15:27
 * @title:
 * @description:
 */
@FunctionalInterface
interface TestMethodRef{
    void test(String s);
}

public class TestMethodRef01 {
    // 类方法
    public static void output(String s) {
        System.out.println("类方法输出: " + s);
    }

    // 不适用方法引用f
    @Test
    public void fun1() {
        TestMethodRef testMethodRef = (s) -> {
            TestMethodRef01.output(s);
        };
        testMethodRef.test("你好");
    }

    @Test
    public void fun2() {

    }


}
