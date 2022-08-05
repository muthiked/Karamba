import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindows {

	public SlidingWindows() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] testA = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(Arrays.toString(maxSlidingWindowFirst(testA, 3)));
		System.out.println(Arrays.toString(maxSlidingWindowSec(testA, 3)));
		System.out.println(Arrays.toString(maxSlidingWindow3(testA, 3)));
	}

	public static int[] maxSlidingWindowFirst(int[] nums, int k) {
		int[] slice = new int[k];
		List<Integer> maxInts = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i + k <= nums.length) {
				slice = IntStream.range(i, i + k).map(s -> nums[s]).toArray();
				Arrays.sort(slice);
				maxInts.add(slice[k - 1]);
			}
		}
		return maxInts.stream().mapToInt(j -> j).toArray();
	}

	public static int[] maxSlidingWindowSec(int[] nums, int k) {
		int[] slice = new int[k];
		List<Integer> maxInts = new ArrayList<>();

		slice = Arrays.copyOfRange(nums, 0, k);
		Arrays.sort(slice);
		maxInts.add(slice[k-1]);

		for (int i = 1; i < nums.length; i++) {
			while (i + k <= nums.length) {
				slice = Arrays.copyOfRange(nums, i, k+i);
				Arrays.sort(slice);
				maxInts.add(slice[k-1]);
				i++;
			}
			
		}

		return maxInts.stream().mapToInt(j -> j).toArray();
	}
	
	public static int[] maxSlidingWindow3(int[] nums, int k) {
		int[] slice = new int[k];
		List<Integer> maxInts = new ArrayList<>();

		slice = Arrays.copyOfRange(nums, 0, k);
		Arrays.sort(slice);
		maxInts.add(slice[k-1]);

		for (int i = 1; i <= nums.length *2 ; i++) {
				slice = Arrays.copyOfRange(nums, i, k+i);
				Arrays.sort(slice);
				maxInts.add(slice[k-1]);
			
			
		}

		return maxInts.stream().mapToInt(j -> j).toArray();
	}

}
