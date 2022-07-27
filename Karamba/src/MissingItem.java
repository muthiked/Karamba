import java.util.Arrays;

public class MissingItem {
	public static void main(String[] args) {

		int[] nums = {1,2,3,5,6,7};

		System.out.println(missingSum(nums)); 
	}
	
	private static int missingSum(int[] nums) {
		System.out.println(Arrays.toString(nums));
		int n = nums.length;
		int sum = ((n+1)*(n+2))/2;
		for(int i=0;i< n;i++) {
			sum-=nums[i];	
		}
		return sum;
	}

}
