import java.util.ArrayList;
import java.util.List;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> counter = new ArrayList<>();
		counter.add("15");
		counter.add("10");
		counter.add("12");
		counter.add("1");

		int n = counter.size();
		String[] ls = counter.toArray(new String[counter.size()]);
//		 int r = 3;  
//		 int factorial = fact(n)/fact(n-r);
//		System.out.println(factorial);
		List<String> combos = new ArrayList<>();
		;
		List<String> sT = helper(ls, 0, combos);
		sT.stream().forEach(System.out::println);
		System.out.println(helper(ls, 0, combos));
	}

	public static int fact(int num) {
		int f = 1;
		int j = 1;
		while (j <= num) {
			f = f * j;
			j++;
		}
		return f;
	}

	public static List<String> helper(String[] ls, int pos, List<String> combos) {

		String sC = "";
		if (pos > ls.length - 1) {
			for (int i = 0; i < ls.length - 1; i++) {
				sC += (ls[i]);
			}

			if (ls.length > 0) {
				sC += ls[ls.length - 1];
//				System.out.println(ls[ls.length-1]);
			}
		}

		for (int i = pos; i < ls.length; i++) {

			String t = ls[pos];
			ls[pos] = ls[i];
			ls[i] = t;

			helper(ls, pos + 1, combos);

			t = ls[pos];
			ls[pos] = ls[i];
			ls[i] = t;
		}
		if (sC.hashCode() != 0) {
			combos.add(sC);
		}
		return combos;
	}

}
