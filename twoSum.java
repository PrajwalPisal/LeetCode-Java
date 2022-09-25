import java.util.*;
class twoSum{
    public int[] twoSum(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        int[] op = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    op[0] = i;
                    op[1] = j;

                    return op;
                }
            }

        }
        return op;
    }

}