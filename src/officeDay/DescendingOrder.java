package officeDay;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {


    public static int[] Descending(int[]arr){
        Arrays.sort(arr);
        int[]Descended=new int[arr.length];
        int j=0;
        for (int i=arr.length-1;i>=0;i--){
            Descended[j]=arr[i];
            j++;
        }
        return Descended;
    }

    public static double[] Descending(double[]arr){
        Arrays.sort(arr);
        double[]Descended=new double[arr.length];
        int j=0;
        for (int i=arr.length-1;i>=0;i--){
            Descended[j]=arr[i];
            j++;
        }

        return Descended;


    }

    public static void main(String[] args) {
        /*
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int[]Descended=Descending(arr);
        System.out.println(Arrays.toString(Descended));

         */
        double[]d={1.2,3.5,-1.3,0,9.7,-11,1};
        double[]dDesc=Descending(d);
        System.out.println(Arrays.toString(dDesc));


    }












}
