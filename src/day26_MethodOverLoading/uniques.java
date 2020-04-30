package day26_MethodOverLoading;

public class uniques {

    public static String uniques(String word){

        String unique="";

        int count=0;
        for(int i=0;i<word.length();i++) {
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += "" + word.charAt(i);
            }
        }

        return unique;

    }


    public static void main(String[] args) {
     String unique= uniques("AABCCCD");
        System.out.println(unique);
    }





}
