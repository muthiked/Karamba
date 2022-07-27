public class RandomStringGenerator {
	public String generator(int len) {
		String generatedString = "";
		int leftLimit = 65; 
	    int rightLimit = 122; 
	    StringBuilder buffer = new StringBuilder(len);
		    for (int k = 0; k < len; k++) {
		        int randomLimitedInt = (int) ((Math.random()* (rightLimit - leftLimit)) + leftLimit);
		        buffer.append((char) randomLimitedInt);
		    }

		    generatedString = buffer.toString();
	    return generatedString;
	}
	
}
