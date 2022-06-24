import java.util.Arrays;

public class SortingAlgo {

	public SortingAlgo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] simpArr = { 60, 2, 67, 20, 30, 3, 423, 56, 89, 96, 3, 68, 90, 7, 500 };
		System.out.println(String.format("The %d character at position is %d", 5, getAtPos(simpArr, 5)));

	}

	private static int getAtPos(int[] arr, int k) {
		System.out.println(Arrays.toString(arr));
		int counter = arr.length;
		for (int m = 0; m < counter; m++) {
			for (int i = 0; i < counter; i++) {
				int small = i;
				for (int j = i + 1; j < counter; j++) {
					if (arr[j] < arr[small]) {
						small = j;

						int aTemp = arr[small];
						arr[small] = arr[i];
						arr[i] = aTemp;

					}

				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr[k];
	}

}
