/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:29
 */

public class CheckIfItIsAStraighLine_1232 {
    /**/
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) {
            return true;
        }
        for(int i=2 ; i < coordinates.length ; i++) {
            if ((coordinates[i-1][1]-coordinates[i-2][1])*(coordinates[i][0]-coordinates[i-1][0]) != (coordinates[i][1]-coordinates[i-1][1])*(coordinates[i-1][0]-coordinates[i-2][0])) {
                return false;
            }
        }
        return true;
    }
    /**/
}
