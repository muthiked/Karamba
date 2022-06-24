import java.util.ArrayList;
import java.util.Arrays;

public class four {


	public static void main(String[] args) {
		String sample = "This Is Not A String";
		int sl = sample.length();
		
		ArrayList<String> hasNoA = new ArrayList<String>();
		for(int sam = 0; sam < sl; sam++) {
			if(sample.charAt(sam) != 'A') {
				hasNoA.add(String.valueOf(sample.charAt(sam)));
			}

			}
		System.out.println(hasNoA);
	}
}
