
import java.util.ArrayList;
import java.util.Arrays;

public class four {


	public static void main(String[] args) {
		String sample = "hello world, def";
		
		sample= sample.replaceAll("[ +[A-Za-z0-9]]", "");
		
		System.out.println(sample);
	}
}
