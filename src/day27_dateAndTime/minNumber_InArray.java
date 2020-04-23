package day27_dateAndTime;

public class minNumber_InArray {

    public static int MinNumber(int[] arr){
       int min=2147483647;
       for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }
       }
        System.out.println(min);
       return min;
    }

    public static double MinNumber(double[] arr){
        double min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        return min;
    }
    public static double MaxNumber(double[]arr){
        double max=arr[0];
        for (double each:arr) {
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);
        return max;
    }

   public static int MaxNumber(int[]arr){
       int max=-2147483648;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       System.out.println(max);
       return max;
   }



    public static void main(String[] args) {
        int []arr={1,2,3,-15,0};
        double[] arr1={1.0,2.7,0.7,-1.5};
            MinNumber(arr1);
            MaxNumber(arr1);
    }




}
