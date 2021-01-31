package com.xsz.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class Demo02Test {
    public static int[] getIntersect(Supplier<int[]> sup){
        return sup.get();
    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] rs=getIntersect(
                ()->{
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


                    return  set2.stream().mapToInt(Number::intValue).toArray();
                }

        );

        Arrays.stream(rs).forEach(e-> System.out.println(e));
    }
}
