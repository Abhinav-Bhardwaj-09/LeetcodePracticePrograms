/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 17-07-2021
 * Time: 22:04
 */

public class SearchInsertPosition_35 {

    /* Simple for loop */
    public int searchInsert(int[] nums, int target) {
        int targetIndex = 0;
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] >= target) {
                return targetIndex;
            }
            targetIndex++;
        }
        return nums.length;
    }


}

