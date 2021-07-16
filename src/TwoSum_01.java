/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:02
 */

public class TwoSum_01 {

    /**/
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i<nums.length; i++) {
            for(int j = i; j+1<nums.length; j++) {
                if(nums[i] + nums[j+1] == target) {
                    arr[0] = i;
                    arr[1] = j+1;
                }
            }
        }
        return arr;
    }
    /**/
}
