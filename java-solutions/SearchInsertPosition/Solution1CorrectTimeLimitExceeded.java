package SearchInsertPosition;


//wrong: required algorithm with O(log n) runtime 
//complexity
class Solution1CorrectTimeLimitExceeded {
    public int searchInsert(int[] nums, int target) {
    	int i=0;
    	int result=0;
    	while(i<nums.length) {
    		if(nums[i]==target) {
    			result=i;
    			break;
    		}
    		i++;
    	}
    	i=nums.length-1;
    	while(i>0) {
    		if(target>nums[i]) {
    			result=i;
    			break;
    		}
    	}
    	return result;
    }
}


