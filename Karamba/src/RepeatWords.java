import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatWords {

	public RepeatWords() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeat("Lets play play java , java is a good java one , a very goog one"));

	}

	private static Map<String, Integer> repeat(String x) {
		String[] aString = x.split(" ");
		Map<String, Integer> xs = new HashMap<>();
		Set<String> bigger = new HashSet<>();
		int count  = 0;
		for(String aKey : aString) {
		if(xs.get(aKey) == null) {
			xs.put(aKey,1);
		}
		else {
			xs.put(aKey,(int)(xs.get(aKey))+1);
			if(xs.get(aKey) > count) {
				bigger.add(aKey);
			}
			
		}
}
		
		return xs;
}
}