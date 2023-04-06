package nuc.ss.edu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class myCollection {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String("0"));
        arrayList.add(new String("1"));
        arrayList.add(new String("2"));



        arrayList.add(new car("大黄蜂",0));
        arrayList.add(new car("甲壳虫",1));
        arrayList.add(new car("小蜜蜂",2));

        /*for (Object o1 : arrayList) {
            System.out.println(o1.toString());
        }*/

        Object[] array = arrayList.toArray();
        System.out.println(array[4]);

        arrayList.isEmpty();
        arrayList.addAll(10,arrayList);
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}

