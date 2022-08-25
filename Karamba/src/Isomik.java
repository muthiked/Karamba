
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomik {

	public Isomik() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iso("ACAB", "GHGK"));
	}

	private static boolean iso(String a, String b) {
		if (a == null || b == null) {
			return false;
		}
		if (a.length() != b.length()) {
			return false;
		}
		Map<Character, Character> isoMap = new HashMap<>();
		Set<Character> isoSet = new HashSet<>();

		for (int i = 0; i < a.length(); i++) {
			char v = a.charAt(i), w = b.charAt(i);

			if (isoMap.containsKey(v)) {
				if (isoMap.get(v) != w) {
					return false;
				}
			}
			else {
				if (isoSet.contains(w)) {
					return false;
				}
}
				isoMap.put(v, w);
				isoSet.add(w);
			}

		return true;
	}
}
