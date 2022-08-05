
public class BinarySercher {

	public BinarySercher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 10, 20, 30, 50, 60, 80, 110, 130, 140, 170 };

		System.out.println(searchForElementLoop(x, 110));

		System.out.println(searchForElementLoop(x, 105));
		
		System.out.println(searchForElementRec(x, 110, 0, x.length));

		System.out.println(searchForElementRec(x, 105, 0, x.length));
	}

	private static int searchForElementLoop(int[] arr, int search) {
		int min = 0;
		int max = arr.length;
		int mid = 0;

		while (min <= max) {
			mid = (min + max) / 2;

			if (arr[mid] == search) {

				return mid;
			} else if (arr[mid] < search) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		return -1;
	}

	private static int searchForElementRec(int[] arr, int search, int min, int max) {
		if(min > max) {
			return -1;
		}
		int	mid = (min + max) / 2;
//			System.out.println(mid);
			if (arr[mid] == search) {
				return mid;
			} else if (search > arr[mid]) {
				return searchForElementRec(arr, search, mid + 1,arr.length);
			} else {
				return searchForElementRec(arr, search, min,mid - 1);
			}
		
//		return -1;
	}

}
