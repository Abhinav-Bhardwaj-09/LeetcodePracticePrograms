/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:24
 */

public class SingleElementInASortedArray_540 {
    /**/
        for (int index = 0; index < nums.length; index = index + 2) {
        if (index == (nums.length - 1)) {
            return nums[index];
        }
        else if (nums[index] != nums[index + 1]) {
            return nums[index];
        }

    }
        return -1;
}
    /**/
}
