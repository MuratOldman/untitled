package day26_MethodOverLoading;

public class MethodOverloading2 {

    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int sum(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }

    public static int sum(int a,int b,int c, int d){
        int sum=a+b+c+d;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println( sum(2,5,24));
        System.out.println(sum(34,45,78,99));
        int sum1=sum(22,11);
        int sum2=sum(22,11,33);
        int sum3=sum(11,22,44,555);
        System.out.println(sum1+sum2+sum3);


    }








}
