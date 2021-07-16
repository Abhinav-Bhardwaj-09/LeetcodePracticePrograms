/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:22
 */

public class IsSubsequence_392 {
    /**/
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        for(int index = 0; index < t.length(); index++){
            if(counter < s.length() && s.charAt(counter) == t.charAt(index)){
                counter++;
            }
        }

        return counter == s.length();
    }
    /**/
}
