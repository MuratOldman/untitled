package day27_dateAndTime;

public class unique_element_InArray {

    public static String Unique(int[]arr){
        int count=0;
        String unique="";
        int size=0;

        for(int i=0;i<arr.length;i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                unique += " " + arr[i];
            }
        }

        System.out.println(unique);
        return unique;
    }


    public static void main(String[] args) {
        int[]arr={1,1,2,3,4,5};
        Unique(arr);
    }



}
