package codingBat;

public class countYZ {
    /*
    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
     count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not
     an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
     */

    public static int countYZ(String str) {
        str=str.toLowerCase();
        String[] st={};
        if(str.contains(" ")){
         st=str.split(" ");
        }else if(str.contains(":")){
         st=str.split(":");
        }else if(str.contains("--")){
         st=str.split("--");
        }else if(str.contains("!!")){
         st=str.split("!!");
        }


        int count=0;
        for(int i=0;i<st.length;i++){
            if((st[i].charAt(st[i].length()-1)=='y')||(st[i].charAt(st[i].length()-1)=='z')){
                count++;
            }

        }
       return count;

    }


    public static void main(String[] args) {

        int count=countYZ("!!yaz--kay!!");
        System.out.println(count);


    }






}
