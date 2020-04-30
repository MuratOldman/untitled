package day26_MethodOverLoading;

public class MethodOverloading3 {


    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static double sum(double a,double b){
        double sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,7.7));
    }







}
