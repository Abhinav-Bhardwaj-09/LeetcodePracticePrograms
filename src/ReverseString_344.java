/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:19
 */

public class ReverseString_344 {
    /**/
    public void reverseString(char[] s) {
        char temp;
        for(int index = 0; index < s.length/2; index++) {
            temp = s[index];
            s[index] = s[s.length - index - 1];
            s[s.length - index - 1] = temp;
        }
    }
    /**/
}
