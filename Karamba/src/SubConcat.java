import java.util.ArrayList;
import java.util.List;

public class SubConcat {

	public SubConcat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"bar","foo","the"};
		List<String> combos = new ArrayList<>();
		List<String> k = BreakDown.helper(s, 0, combos);
		String[] j = k.stream().toArray(String[]:: new);
		List<Integer> occurences = findSubstring("barfoofoobarthefoobarman", j);
		System.out.println(occurences);
		
	}
	
	static int fact(int n) {
		int a = 1;
		int b = 1;
		while(b <= n) {
			a=a*b;
			b++;
		}
		return a;
	}
	
	private static List<Integer> findSubstring(String s, String[] words) {
		String k = "";
		String l = "";
		ArrayList<Integer> j = new ArrayList<>();
//		int factor = size
        for(int i = 0; i < words.length; i++){
            if(s.contains(words[i])) {
        	j.add(s.indexOf(words[i]));
        }
        }
	
        return j;
		
	}
}
