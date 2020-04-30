package Resources;

public class Library {

    public static int CountOf_str2(String str1,String str2){
        int countOf_str2=0;

        while (str1.contains(str2)){
            str1=str1.replaceFirst(str2,"");
            countOf_str2++;

        }
        return countOf_str2;
    }


    public static String RemoveDuplicate(String str){

        String removeDup="";
        for(int i=0;i<str.length();i++){
            if(!removeDup.contains(""+str.charAt(i))){
                removeDup+=""+str.charAt(i);
            }
        }
        return removeDup;
    }

    public static String frequencyOf_characters(String sentence){
        int frequency=0;
        String frequencyOf_characters="";
        String nonDup=RemoveDuplicate(sentence);
        for(int i=0;i<nonDup.length();i++){
           frequency= CountOf_str2(sentence,""+nonDup.charAt(i));


            frequencyOf_characters+=""+nonDup.charAt(i)+frequency;
        }


        return frequencyOf_characters;

    }





}
