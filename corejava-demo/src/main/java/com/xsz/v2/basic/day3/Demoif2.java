package com.xsz.v2.basic.day3;

public class Demoif2 {
    public static void main(String[] args) {
        case3();
    }
//    break使用场景：终止switch或者循环 在选择结构switch语句中
//    在循环语句中 离开使用场景的存在是没有意义的
    public static void case1(){
        for (int i = 1; i<=10; i++) {
            //需求:打印完两次HelloWorld之后结束循环
             if(i == 3){
                 break;
             }
             System.out.println("HelloWorld"+i);
        }
    }

//    使用场景：结束本次循环，继续下一次的循环
    public static void case2(){
        for (int i = 1; i<=10; i++) {
            //需求:打印完两次HelloWorld之后结束循环
            if(i == 3){
                continue;
            }
            System.out.println("HelloWorld"+i);
        }
    }


    //    嵌套循环格式：
//    所谓嵌套循环，是指一个循环的循环体是另一个循环。
//    比如for循环里面还有一个for循环，就是嵌套循环。总 共的循环次数=外循环次数*内循环次数
    public static void case3(){
        //5*8的矩形，打印5行*号，每行8个 //外循环5次，内循环8次
         for(int i = 0; i < 5; i++){
             for(int j = 0; j < 8; j++){
                // 不换行打印星号
                 System.out.print("*");
             }
            // 内循环打印8个星号后，需要一次换行
             System.out.println();
         }
    }

}
