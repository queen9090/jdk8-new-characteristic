package cn.king.lambda;

import org.junit.Test;

/**
 * @author: wjl@king.cn
 * @createTime: 2019/6/25 19:48
 * @title:
 * @description: Lambda表达式的实际应用示例.
 * 方法的形参是函数式接口, 那么我们用Lambda表达式作为实际参数
 */

// 可关闭的.
@FunctionalInterface // 函数式接口
interface Closeable {
    void close();
}

class CloseDoor {
    public void doClose(Closeable c) {
        c.close();
    }
}

public class TestLambda04 {

    @Test
    public void fun1() {
        CloseDoor closeDoor1 = new CloseDoor();
        closeDoor1.doClose(
                new Closeable() {
                    @Override
                    public void close() {
                        System.out.println("使用匿名内部类实现");
                    }
                }
        );

        // 注意, 下面的Lambda不会生成一个单独.class文件. 但是肯定会生成字节码.
        // 匿名内部类是会生成一个.class文件的.
        closeDoor1.doClose(() -> System.out.println("使用Lambda实现"));
    }


}
