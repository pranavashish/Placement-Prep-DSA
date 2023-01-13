import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {

    public static boolean anagram(String str1, String str2){
         str1 = str1.toLowerCase();
         str2 = str2.toLowerCase();

         if(str1.length() == str2.length()){
             char str1array[] = str1.toCharArray();
             char str2array[] = str2.toCharArray();

             Arrays.sort(str1array);
             Arrays.sort(str2array);

             if(Arrays.equals(str1array , str2array)){
                 return true;
             }

         }
     return false;
    }

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "caare";
        System.out.println(anagram(str1,str2));
    }


}
