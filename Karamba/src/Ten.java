import java.util.Arrays;

public class Ten {

	public Ten() {
	}

	public static void main(String[] args) {
		int[] simpArr = { 60, 2, 25, 67, 20, 30, 3, 423, 56, 89, 96, 90, 3, 68, 90, 7, 500 };
		System.out.println(Arrays.toString(sortArr(simpArr)));
	}
	
	private static int[] sortArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j< arr.length; i++) {
				int least = j;
				for(int k=j+1; k < arr.length; k++) {
					if(arr[k] < arr[least]) {
						least = k;
						int holder = arr[least];
						arr[least] = arr[j];
						arr[j] = holder;
					}
				}
			}
		}	
		return arr;
	}

}
