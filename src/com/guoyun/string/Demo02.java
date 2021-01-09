package com.guoyun.string;

/*
1:定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
2:定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。返回值类型 String，参数列表 int[] arr
3:在方法中遍历数组，按照要求进行拼接
4:调用方法，用一个变量接收结果
5:输出结果
*/
public class Demo02 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        String s = arrayToString(arr);

        System.out.println("s:" + s);
    }

    public static String arrayToString(int[] arr) {
        //在方法中遍历数组，按照要求进行拼接 String s = "";
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            //判断是否为最后的一个元素
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i] + ", ";
            }
        }
        s += "]";
        return s;
    }
}
