package day30_ArrayList;

import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
/*
write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
 */
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>Unique=new ArrayList<>();
        list.add(1); list.add(3);
        list.add(1); list.add(4);
        list.add(2); list.add(5);
        list.add(3);
        int count=0;
        for (Integer each:list){
            count=0;
            for (Integer each1:list){
                if(each==each1){
                    count++;
                }
            }if(count==1){
                Unique.add(each);
            }
        }

        System.out.println(Unique);
    }
}
