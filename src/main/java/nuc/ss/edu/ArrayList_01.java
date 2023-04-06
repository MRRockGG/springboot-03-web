package nuc.ss.edu;

import java.util.ArrayList;


public class ArrayList_01 {
    public static void main(String[] args) {
        //创建空集合
        ArrayList<String> list = new ArrayList<>();//泛型定义为String
        //采用默认追加的方式添加元素
        System.out.println(list.add("刘德华"));
        System.out.println(list.add("张学友"));
        System.out.println(list.add("郭富城"));
        System.out.println(list.add("黎明"));

        //插入的方式添加元素
//        list.add(10,"谭咏麟");//插入元素方法索引值不能大于集合中元素个数
//        list.add(4,"谭咏麟");//表示在集合中最后位置插入元素，与追加相同
        list.add(1,"谭咏麟");//指定位置插入元素，索引位置之后的元素会自动向后进行移动

        ArrayList<String> newList = new ArrayList<>();//创建新的集合
        newList.add("小沈阳");
        newList.add("宋小宝");
        newList.add("赵四");
        newList.add("刘能");

        //查看集合中的元素
        System.out.println("原集合内部元素：" + list);
        System.out.println("新集合内部元素：" + newList);

        list.addAll(newList); //将新集合全部元素添加到原集合中
        System.out.println("原集合内部元素：" + list);
    }
}