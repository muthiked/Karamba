
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamers {

	public Streamers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(Stream.of("Bob", "", "Jane").min((s1, s2) -> s1.compareTo(s2))
//				.filter(s -> s.endsWith("n"))
//				.orElse("yellow"));
//		
//		System.out.println(Stream.of("green", "yellow", "blue").min((s0, s2) -> s0.compareTo(s2)));
//	   
//		List<Integer> number = Arrays.asList(2,4,5,7,8,2,9,4);
//		Object sq = number.stream().map(x -> x*x).collect(Collectors.toList());
//		System.out.println(sq);
//		
//		List<String> words = Arrays.asList("Reflection","Collection","Stream");
//		Object sq1 = words.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
//		System.out.println(sq1);
		String[] names = { "Martin", "David", "Joyce", "Jackson", "Moses", "Jane" };
		List<String> ls = new ArrayList<String>();
		ls.add("Car");
		ls.add("Truck");
		ls.add("Bus");
		Stream<String> st = ls.stream();
		stList(st);
		stArr(names);
		doubleC(ls.stream());

		System.out.println("===========================");
		int[] testA = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(Arrays.toString(maxSlidingWindow(testA, 3)));
	}

	private static void stArr(String[] arr) {
		System.out.println(Stream.of(arr).filter(k -> k.startsWith("J")).collect(Collectors.toList()));
	}

	private static void stList(Stream<String> arr) {
		System.out.println(arr.filter(k -> k.startsWith("T")).collect(Collectors.toList()));
	}

	private static void doubleC(Stream<String> arr) {
		System.out.println(arr.sorted().collect(Collectors.toList()));
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] slice = new int[k];
		List<Integer> maxInts = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i + k <= nums.length) {
				slice = IntStream.range(i, i + k).map(s -> nums[s]).toArray();
				System.out.println(Arrays.toString(slice));
				Arrays.sort(slice);
				maxInts.add(slice[k - 1]);
			}
		}
		return maxInts.stream().mapToInt(j -> j).toArray();
	}

}
