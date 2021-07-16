/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:06
 */

public class LongestCommonPrefix_14 {
    /**/
    public String longestCommonPrefix(String[] input_array) {
        if(input_array == null || input_array.length == 0)    {
            System.out.print("");
            return "";
        }
        String prefix = input_array[0];
        for(int index = 1; index < input_array.length; index++){
            while(input_array[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;
    }
    /**/
}
