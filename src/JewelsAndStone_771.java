/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:27
 */

public class JewelsAndStone_771 {
    /**/
    public int numJewelsInStones(String jewels, String stones) {
        int no_of_jewels = 0;
        for(int jewels_Index = 0; jewels_Index < jewels.length(); jewels_Index++) {
            for(int stones_Index = 0; stones_Index < stones.length(); stones_Index++) {
                if(jewels.charAt(jewels_Index) == stones.charAt(stones_Index)) {
                    no_of_jewels++;
                }
            }
        }

        return no_of_jewels;
    }
    /**/
}
