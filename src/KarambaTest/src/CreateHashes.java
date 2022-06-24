import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class CreateHashes {
	
	public CreateHashes() {
		// TODO Auto-generated constructor stub
	}
	public CreateHashes(int k) {
		// TODO Auto-generated constructor stub
		Integer kNew = Integer.valueOf(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> hMap = new HashMap<Integer , Integer>();
		CreateHashes ch = new CreateHashes();
		for(int i=0; i< 5; i++) {
		hMap.put(i, ch.randomStringGenerator().hashCode());
		} 
		for(Entry<Integer, Integer> m: hMap.entrySet()) {
		System.out.println(m);
		}
		
		Map<Integer, String> hTable = new Hashtable<Integer , String>();
		for(int i=0; i< 5; i++) {
		hTable.put(ch.randomStringGenerator().hashCode() , ch.randomStringGenerator());
		} 
		for(Entry<Integer, String> m: hTable.entrySet()) {
		System.out.println(m);
		}
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		byte[] encodedhash = md.digest(
//				  originalString.getBytes(StandardCharsets.UTF_8));
	}
	
	
	private String randomStringGenerator() {
		String generatedString = "";
		int leftLimit = 65; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
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
