package com.xsz.leetcode;

public class ProfitDemo {
    /**
     * 只允许 一次交易
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        int rs=0;
        int min=Integer.MAX_VALUE;
        for(int p:prices ){
            min=Math.min(min,p);
            rs=Math.max(rs,p-min);
        }
        return rs;
    }/**
     * 可以多次交易
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices){
        int rs=0;
        int min=Integer.MAX_VALUE;
        for(int i=prices.length-1;i>0; ){
            int head=i-1;
            while(head>0&&prices[head]<prices[head+1]&&prices[head]>prices[head-1]){
                head--;
            };
            //经过while循环以后head的位置一定是波谷
            //i因为从最后一位开始，所以开始肯定是波峰
            if(head>=0){
                int diff=prices[i]-prices[head];
                if(diff>0){
                    rs+=diff;
                }
            }
            i=head;
        }
        return rs;
    }

    public static void main(String[] args) {
        ProfitDemo profitDemo=new ProfitDemo();
        int[] prices={20,40,90,50,10,60};
        System.out.println("一次交易最大收益："+profitDemo.maxProfit(prices));
        System.out.println("多次交易最大收益："+profitDemo.maxProfit2(prices));
    }
}
