
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

	static byte[] eh;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> hMap = new HashMap<>();
		CreateHashes ch = new CreateHashes();
		for (int i = 0; i < 5; i++) {
			hMap.put(i, ch.randomStringGenerator().hashCode());
		}
		for (Entry<Integer, Integer> m : hMap.entrySet()) {
			System.out.println("HASHED::    " + getAHash(ch.randomStringGenerator()));
			Map<Integer, String> hTable = new Hashtable<Integer, String>();
			String rndom = ch.randomStringGenerator();
			for (int i = 0; i < 3; i++) {
				hTable.put(ch.randomStringGenerator().hashCode(), rndom);
			}
			for (Entry<Integer, String> l : hTable.entrySet()) {
				System.out.println(l);
			}
		}
	}

	public static byte[] getAHash(String random) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			eh = md.digest(random.getBytes(StandardCharsets.UTF_8));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eh;
	}

	private static String bytesToHex(byte[] hash) {
		StringBuilder hexString = new StringBuilder(2 * hash.length);
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}
		return hexString.toString();
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
			randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));

			buffer.append((char) randomLimitedInt);
		}
		generatedString = buffer.toString();

		return generatedString;
	}

}
