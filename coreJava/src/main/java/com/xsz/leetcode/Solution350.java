package com.xsz.leetcode;

import java.util.*;

public class Solution350 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        Solution350 solution350=new Solution350();
        int[] rs=solution350.intersect(nums1,nums2);
        Arrays.stream(rs).forEach(e->System.out.println(e));

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1){
            set.add(i);
        }
        for (int i :nums2){
            if (set.contains(i)){
                set2.add(i);
            }
        }
//        for (int i : set2){
//            System.out.println(i);
//        }

        return  set2.stream().mapToInt(Number::intValue).toArray();
    }
    public int[] intersect2(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {

            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

}
