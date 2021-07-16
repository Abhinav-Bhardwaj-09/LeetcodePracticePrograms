/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:26
 */

public class PalindromicSubstrings_647 {
    /**/
    public int countSubstrings(String s) {
        int count = 0;
        boolean [][] arr = new boolean[s.length()][s.length()];
        for (int index = s.length() - 1; index >= 0; index--) {
            for (int j = index; j < s.length(); j++) {
                if(s.charAt(index) == s.charAt(j)){
                    if(j - index  + 1 < 3 || arr[index + 1][j - 1]){
                        arr[index][j] = true;
                    }
                    else{
                        arr[index][j] = false;
                    }

                }
                if(arr[index][j]) {
                    count++;
                }
            }
        }
        return count;
    }
    /**/
}
