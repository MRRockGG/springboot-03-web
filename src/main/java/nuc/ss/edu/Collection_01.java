package nuc.ss.edu;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_01 {
    public static void main(String[] args) {
        //父类的引用指向子类的对象，形成多态
        Collection<String> con = new ArrayList<>();

        //追加的方式添加元素
        con.add("东邪");
        con.add("西毒");
        con.add("南帝");
        con.add("北丐");
        con.add("中神通");

        //删除,通过元素名称删除元素
        System.out.println(con.remove("西毒"));
        //判断集合中是否包含指定参数元素
        System.out.println(con.contains("西毒"));  //false
        System.out.println(con.contains("东邪"));    //true
        //获取集合中元素个数
        System.out.println(con.size());
        //判断是否为空
        System.out.println(con.isEmpty());//false
        //清空集合
        con.clear();
        //判断是否为空
        System.out.println(con.isEmpty());//true
        System.out.println(con);//打印集合的元素
    }
}
