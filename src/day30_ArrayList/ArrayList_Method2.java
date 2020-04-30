package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method2 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        // if i want to remove "B"
       // list.remove(1); //first option. we used index number of "B"
       // System.out.println(list);

        String str="B";
       list.remove(str); // we write object "B"
        System.out.println(list);//second option
        System.out.println("======================================");
        list.clear();// erase all objects. size will be 0.

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.indexOf(1);// it gives us index 0. because first match index 0. it gives int num. you can assign to int value
        //list1.indexOf(100);// it gives -1 . because we don't have object 100 . it's not exist our ArrayList
        int z=list1.lastIndexOf(1);// it gives 1
        System.out.println(z);
    }
}
