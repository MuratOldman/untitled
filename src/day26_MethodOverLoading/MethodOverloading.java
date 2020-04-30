package day26_MethodOverLoading;

public class MethodOverloading {

    // multiple methods calling sharing same name is named method overloading
    // parameter must be different

    public static void method(int a){
        System.out.println("original method");
    }

    public static void method(double a){
        System.out.println("overloaded method");
    }


    public static void main(String[] args) {
        method(10.0);
        method(5);
    }



}
