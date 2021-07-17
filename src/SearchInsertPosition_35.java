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
    /**/

    /* Simple Binary Search */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid;

        if(nums[0] >= target) {
            return 0;
        }

        while(start <= end) {
            mid = (start + end) / 2;

            if(nums[mid] > target) {
                end = mid - 1;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {

                return mid;
            }
        }

        if(start > end) {
            return start;
        }

        return nums.length;
    }
    /**/


}

