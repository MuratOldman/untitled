package day26_MethodOverLoading;

public class frequency {

/*
write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3

				frequency("ABAB", 'B') ==> 2

			Note: MUST use Arrays and for each loop

 */

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


    public static void main(String[] args) {
        int count=frequency("aabbbcccd",'c');
        System.out.println(count);
    }



}
