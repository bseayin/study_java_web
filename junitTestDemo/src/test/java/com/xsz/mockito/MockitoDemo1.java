package com.xsz.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
//为了代码测试的方便，直接在测试类中静态导入
import static org.mockito.Mockito.*;



public class MockitoDemo1 {

    @Test
    public void testMockBase(){
        //创建ArrayList的Mock对象
        List mockList = mock(ArrayList.class);
        //pass
        Assert.assertTrue(mockList instanceof ArrayList);

        //当我们mockList调用方法去add("张三")的时候会返回true
        when(mockList.add("张三")).thenReturn(true);
        //当我们mockList调用方法size()的时候返回10
        when(mockList.size()).thenReturn(10);
        //pass
        Assert.assertTrue(mockList.add("张三"));
        //pass
        Assert.assertFalse(mockList.add("李四"));
        //pass
        Assert.assertEquals(mockList.size(),10);
        //null
        System.out.println(mockList.get(0));
    }


    @Test
    public void simpleTest(){
        //创建mock对象，参数可以是类，也可以是接口
        List<String> list = mock(List.class);
        //设置方法的预期返回值
        when(list.get(0)).thenReturn("helloworld");
        String result = list.get(0);
        //验证方法调用(是否调用了get(0))
        verify(list).get(0);
        //junit测试
        Assert.assertEquals("helloworld", result);
    }

    @Test
    public void argumentMatcherTest(){
        List<String> list = mock(List.class);
        when(list.get(anyInt())).thenReturn("hello","world");
        String result = list.get(0)+list.get(1);
        verify(list,times(2)).get(anyInt());
        Assert.assertEquals("helloworld", result);
    }

}
