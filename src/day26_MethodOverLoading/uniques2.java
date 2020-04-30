package day26_MethodOverLoading;

public class uniques2 {

    public static void main(String[] args) {

      String unique= uniques2("AABCCD");
        System.out.println(unique);

    }

    public static String uniques2(String word)
    {
   String unique="";
        for(int i=0; i<word.length();i++ ){
             int num  =frequency(word,word.charAt(i));
            if(num==1){
                 unique+=""+word.charAt(i);
            }

        }
        return unique;
    }


    public static int frequency(String str,char ch){
        int count=0;
        char []ch1 =str.toCharArray();
        for(char each: ch1){
            if(each==ch){
                count++;
            }
        }

        return count;

    }




}
