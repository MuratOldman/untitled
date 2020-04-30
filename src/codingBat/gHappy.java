package codingBat;

public class gHappy {
    /*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
    to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
     */

    public static boolean gHappy(String str) {
        boolean b=false;
       if(str.contains("g")){
           if(str.indexOf('g')+1=='g'||str.indexOf('g')-1=='g'){
               b=true;
           }

       }
       else{ b=false;}


       return b;
    }

    public static void main(String[] args) {

    }


}
