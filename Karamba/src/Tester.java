import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] ls = {"fooo","barr","wing","ding","wing"};
		String st = "foobarfoobar";
		String[] ls = {"foo", "bar"};
//		String[] ls = {"a","a"};
		List<String> lsAsList = Stream.of(ls).distinct().collect(Collectors.toList());
		String[] newLs = lsAsList.stream().toArray(String[]:: new);
		List<Integer> occurences = findSubstring(st, ls);
		
		System.out.println(occurences);
	}

	    public static List<Integer> findSubstring(String s, String[] words) {

			List<String> combos = new ArrayList<>();
			List<String> k = helper(words, 0, combos);
			String[] j = k.stream().toArray(String[]:: new);

			List<Integer> cGth = new ArrayList<Integer>(getSubstring(s, j, 0));
			
	        return cGth;
			
		}
	    
		private static Set<Integer> getSubstring(String s, String[] words, int pos) {
			
			Set<Integer> j = new HashSet<>();
	        for(int i = pos; i < words.length; i++){
	        	
	            if(s.contains(words[i])) {
	        	j.add(s.indexOf(words[i]));
	        	for(int z = i+s.indexOf(words[i]) ; z < words.length; z++) {
	        		
	        		if(s.length() -1 > z && s.substring(z).contains(words[i])) {
	        			
	        			int v = s.substring(z).indexOf(words[i]) + i+z;
	        			if(v < s.length()) {
	        			j.add(v);
	        		
	        		}
	        	}}
	        }
	        }
		
	        return j;
			
		}
	    
	    public static List<String> helper(String[] ls, int pos, List<String> combos) {

			String sC = "";
			if (pos > ls.length - 1) {
				for (int i = 0; i < ls.length - 1; i++) {
					sC += (ls[i]);
				}

				if (ls.length > 0) {
					sC += ls[ls.length - 1];
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
