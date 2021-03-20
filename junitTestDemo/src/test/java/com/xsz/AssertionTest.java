package com.xsz;

import org.junit.Assert;
import org.junit.Test;

/**
 * assertEquals() 如果比较的两个对象是相等的，此方法将正常返回；否则失败显示在JUnit的窗口测试将中止。
 * assertSame() 和 assertNotSame() 方法测试两个对象引用指向完全相同的对象。
 * assertNull() 和 assertNotNull() 方法测试一个变量是否为空或不为空(null)。
 * assertTrue() 和 assertFalse() 方法测试if条件或变量是true还是false。
 * assertArrayEquals() 将比较两个数组，如果它们相等，则该方法将继续进行不会发出错误。否则失败将显示在JUnit窗口和中止测试。
 * ————————————————
 */
public class AssertionTest {
    @Test
    public void test() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;

        int var1 = 1;
        int var2 = 2;

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        Assert.assertEquals(obj1, obj2);

        Assert.assertSame(obj3, obj4);
        Assert.assertNotSame(obj2, obj4);

        Assert.assertNotNull(obj1);
        Assert.assertNull(obj5);

        Assert.assertTrue(var1 < var2);
        Assert.assertFalse(var1 > var2);

        Assert.assertArrayEquals(array1, array2);

    }

}
