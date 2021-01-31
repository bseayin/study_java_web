package com.xsz.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProfitDemoTest {
    ProfitDemo profitDemo=new ProfitDemo();
    @Before
    public  void m1(){
        System.out.println("执行测试之前");
    }

    @After
    public  void m2(){
        System.out.println("执行测试之后");
    }
    @Test
    public void testmaxProfit(){
        int[] a={10,30,20,90,50};
        int rs= profitDemo.maxProfit(a);
        Assert.assertEquals(70,rs);
    }
}
