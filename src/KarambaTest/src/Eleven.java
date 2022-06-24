
public class Eleven {

	public Eleven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Eleven el = new Eleven();
		System.out.println(el.checkIsomorphic("AABC", "CCFG"));

	}
	
	private boolean checkIsomorphic(String a, String b) {
		if(a == null || b == null) {
			return false;
		}
		else if (a.length() != b.length()) {
			return false;
		}
		
		return true;
	}

}
