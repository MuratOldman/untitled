package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(5); //0
        list1.add(7); //1
        list1.add(8); //2

        list1.add(1,6); // 6 placed in index 1
        System.out.println(list1);

        list1.set(3,9);
        System.out.println(list1); // 9 replaced instead of 8

        ArrayList<String>list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");
        System.out.println(list2);
        System.out.println("========================================");

        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        list3.remove(2); // this is an index number . removed object in index number 2
        System.out.println(list3);//[1,2,4]

        Integer b=4; // this is an object
        list3.remove(b); // object 4 removed. its not about index number
        System.out.println(list3); //[1,2]
        // there are two type remove method in the ArrayList
        System.out.println("==========================================");

        ArrayList<Integer>list4=new ArrayList<>();
        list4.add(20);
        list4.add(30);
        list4.add(40);
        // if i want to remove 40 in the list4, i have to use object remove method
        Integer a=40;// this is an object. object a=40
        // if i write list4.remove(40) ==> it'll give me an error. Because we don't have index number 40.
        list4.remove(a);
        System.out.println(list4);

    }
}
