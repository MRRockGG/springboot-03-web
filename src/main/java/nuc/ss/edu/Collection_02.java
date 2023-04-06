package nuc.ss.edu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Mr.乐
 * @Description  Collection 集合的遍历
 */
public class Collection_02 {
    public static void main(String[] args) {
        //多态
        Collection<String> con = new ArrayList<>();
        //添加元素
        con.add("abc");
        con.add("def");
        con.add("100");
        con.add("444");

        //Collection集合的遍历方式
        //因为没有索引的概念，所以Collection集合不能使用fori进行遍历

        //增强版for循环，其实底层使用的也是迭代器，在字节码文件中查看
        for (String str : con) {
            System.out.print(str + "\t");
        }
        System.out.println();//换行

        //迭代器，集合专属的遍历工具
        Iterator<String> it = con.iterator();//创建迭代器对象
        while (it.hasNext()){//判断下一个位置是否有元素
            System.out.print(it.next() + "\t");//获取到下一个位置的元素
        }
    }
}