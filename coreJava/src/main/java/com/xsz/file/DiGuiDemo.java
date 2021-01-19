package com.xsz.file;

public class DiGuiDemo {
    public static void main(String[] args) {
        //计算1~num的和，使用递归完成
         int num = 5;
        // 调用求和的方法
         int sum = getSum(num);
        // 输出结果
         System.out.println(sum);
         }
        // /*通过递归算法实现. 参数列表:int 返回值类型: int */
         public static int getSum(int num) {
        // /* num为1时,方法返回1, 相当于是方法的出口,num总有是1的情况 */
         if(num == 1){
            return 1;
         }
        // /*num不为1时,方法返回 num +(num‐1)的累和 递归调用getSum方法 */return num
        return num + getSum(num-1);
    }
}
