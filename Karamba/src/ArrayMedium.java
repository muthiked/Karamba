import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayMedium {

	public ArrayMedium() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 3, 8, 9, 15, 17};
		int[] y = {7, 11, 19, 21, 18, 25};
//		int[] x = {1,2,3};
//		int[] y = {3,4};
		System.out.println(findMedianSortedArrays(x,y));
		System.out.println(mineMedian(x,y));
	}
	
	private static double mineMedian(int[] inp1, int[] inp2) {
		if(inp1.length > inp2.length) {
			mineMedian(inp2,inp1);
		}
		int x = inp1.length;
		int y = inp2.length;
		
		int low = 0;
		int high = x;
		
		while (low <= high) {
			int xPartition = (low + high)/2;
			int yPartition = (x + y + 1)/2 - xPartition;
		
		int maxLeftX = (xPartition == 0) ? Integer.MIN_VALUE  : inp1[xPartition - 1];
		int minRightX  = (xPartition == x) ? Integer.MAX_VALUE : inp1[xPartition];
		

		int maxLeftY = (yPartition == 0) ? Integer.MIN_VALUE  : inp2[yPartition - 1];
		int minRightY  = (yPartition == y) ? Integer.MAX_VALUE : inp2[yPartition];
		
		if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
			if((x + y) % 2 == 0 ) {
				System.out.println(maxLeftX +" "+maxLeftY+" "+minRightX+" "+minRightY );
				return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;

			}
			else {
				return (double) Math.max(maxLeftX, maxLeftY);
			}
		} else if(maxLeftX > minRightY) {
			high = xPartition - 1;
		} else {
			low = xPartition + 1;
		}
		}
		throw new IllegalArgumentException();
	}

	private static double findMedianSortedArrays(int input1[], int input2[]) {
        //if input1 length is greater than switch them so that input1 is smaller than input2.
        if (input1.length > input2.length) {
            return findMedianSortedArrays(input2, input1);
        }
        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

            //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                //We have partitioned array at correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
    				System.out.println(maxLeftX +" "+maxLeftY+" "+minRightX+" "+minRightY );
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
                high = partitionX - 1;
            } else { //we are too far on left side for partitionX. Go on right side.
                low = partitionX + 1;
            }
        }

        //Only we we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
    }
	
	private static double findMedSolA(int[] nums1, int[] nums2) {
		int num3 = nums1.length + nums2.length;
		int[] merged = new int[num3];
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			merged[i] = nums1[i];
			count += 1;
		}
		for (int k = 0; k < nums2.length; k++) {
			merged[count] = nums2[k];
			count += 1;
		}
		// System.arraycopy(nums1, 0, merged , 0, nums1.length);
		// System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
		for (int j = 0; j < merged.length; j++) {
			for (int k = 0; k < merged.length; k++) {
				int small = k;
				for (int l = k + 1; l < merged.length; l++) {
					if (merged[l] < merged[small]) {
						small = l;
						int temp = merged[small];
						merged[l] = merged[k];
						merged[k] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(merged));
		double med = 0.0;
		if (merged.length % 2 == 0) {
			int first = merged[(num3 / 2) - 1];
			int sec = merged[num3 / 2];
			med = (first + sec) / 2f;
		} else {
			med = merged[num3 / 2];
		}
		return med;
	}
}