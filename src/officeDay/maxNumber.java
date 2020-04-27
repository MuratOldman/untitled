package officeDay;

public class maxNumber {

    /*
  	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
     */

    public static int maxNumber(int[]arr){
        int maxNUM=0;
        for(int each:arr){
            if(each>maxNUM){
                maxNUM=each;
            }
        }
        return maxNUM;
    }

    public static double maxNumber(double[] arr){
        double maxNUM=0;
        for(double each:arr){
            if(each>maxNUM){
                maxNUM=each;
            }
        }
        return maxNUM;
    }

    public static void main(String[] args) {
       int[]a={2,3,4,5,6,};
       double[]b={1,2,2,3,4,5,7};
       double maxNumber =maxNumber(b);
        System.out.println(maxNumber);
    }

}
