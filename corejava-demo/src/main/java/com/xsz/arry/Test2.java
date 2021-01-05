package com.xsz.arry;

import java.util.Arrays;

/**
 *
 * https://leetcode-cn.com/problems/two-sum/
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class Test2 {

    public static void main(String[] args) {
//        int[] nums={2,7,11,15};
        int[] nums={3,7,1,2,8,3,9};
        int target=6;
        int[] a=new int[2];
        tag:
        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length-1; j >i ; j--){
                if (nums[i] + nums[j] == target){
                    a[0]=i;
                    a[1]=j;
                    break tag;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

}



