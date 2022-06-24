package funFriday;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class Random10StringGenerator {
	private String randomStringGenerator(int length) {
		String generatedString = "";
		int leftLimit = 65; 
	    int rightLimit = 122; 
	    int targetStringLength = length;
		byte[] array = new byte[10];
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int k = 0; k < targetStringLength; k++) {
		        int randomLimitedInt;
					randomLimitedInt = leftLimit + (int) 
					  (random.nextFloat() * (rightLimit - leftLimit + 1));
			
		        buffer.append((char) randomLimitedInt);
		    }
		    generatedString = buffer.toString();

	    return generatedString;
	}
	
}
