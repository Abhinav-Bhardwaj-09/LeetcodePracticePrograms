/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 15:07
 */

public class RansomNote_383 {
    /**/
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] characters = new int[26];
        for(char character : magazine.toCharArray()) {
            characters[character - 'a']++;
        }

        for(char character : ransomNote.toCharArray()) {
            if( --characters[character -'a'] < 0){
                return false;
            }
        }
        return true;
    }
    /**/
}
