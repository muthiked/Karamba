import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrintSubsets {

	public PrintSubsets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintSubsets ps = new PrintSubsets();
		System.out.println(ps.findStream("aaabaa", 'a').toString());
	}

	private ArrayList<String> findStream(String x, char y) {
		int min = 0;
		int max = x.length();
		int tempSize = 0;
		ArrayList<String> hit = new ArrayList<>();
		char[] chars = x.toCharArray();
		while (min < max) {
			if (chars[min] == y) {
				hit.add(Character.toString(y));
			} else if (chars[min] != y && hit.size() > 1) {
				tempSize =loopSize(0, hit.size(), y, hit);
			
		}
			min += 1;
//		seq.addAll(hit);
		}
		if(hit.size() > tempSize) {
			System.out.println("Temp" + tempSize);
			tempSize = loopSize(tempSize,hit.size(), y, hit);
		}
		return hit;
	}

	private int loopSize(int start, int end, char y, ArrayList<String> hit) {
				
		ArrayList<String> tmp = new ArrayList<>();
		int leastMin = 2;
		for (int k = start; k < hit.size(); k++) {
			int[] ints = new int[end - start];
			int count = maxSlidingWindow(ints, leastMin).length;
			for (int l = 0; l < count; l++) {
				tmp.add(Character.toString(y).repeat(leastMin));
			}
			leastMin += 1;
		}
		hit.addAll(tmp);
		return hit.size();
	}
	
	

	public int[] maxSlidingWindow(int[] nums, int k) {
		int[] slice = new int[k];
		List<Integer> maxInts = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i + k <= nums.length) {
				slice = IntStream.range(i, i + k).map(s -> nums[s]).toArray();
//				System.out.println(Arrays.toString(slice));
				Arrays.sort(slice);
				maxInts.add(slice[k - 1]);
			}
		}
		return maxInts.stream().mapToInt(j -> j).toArray();
	}
}
