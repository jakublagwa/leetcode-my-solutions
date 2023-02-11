package searchInsertPosition;


//this code has O(log n) complexity
//im więcej danych wejściowych, tym proporcjonalnie 
//mniej operacji program musi wykonać w porównaniu
//z ilością danych
public class BinarySearchSolutionLogNComplexity {
	public int searchInsert(int[] nums, int target) {
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return left;
	}
	//correct, beats 100% time complexity
}
