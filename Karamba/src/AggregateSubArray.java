import java.util.ArrayList;
import java.util.Arrays;

public class AggregateSubArray {

	public AggregateSubArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {-1, 267,11, 10, 6, -9,-8, 4,6,25, 9};
		System.out.println(Arrays.toString(check(b)));
	}
	private static int[] check(int[] anArr) {
		ArrayList<Integer> temp = new ArrayList<>();
		int highest = 0;
		int simpleSum = 0;
		for(int i =1; i< anArr.length; i++) {
			simpleSum = anArr[i] + anArr[i-1];
			if(simpleSum > highest) {
				temp.clear();
				highest = simpleSum;
				temp.add(anArr[i-1]);
				temp.add(anArr[i]);
			}
		}
		return temp.stream().mapToInt(i -> i).toArray();
	}
}
