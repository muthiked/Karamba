
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Threes implements myLamb {

	public static void main(String[] args) {
		myLamb ml = (int a) -> a;
		int output = ml.someMethod(20); // returns 25
		System.out.println(output);
		RandomStringGenerator rsg = new RandomStringGenerator();
		Stream.Builder<String> builder = Stream.builder();
		StringBuilder sBuild = new StringBuilder();
		Stream<String> letter = Stream.empty();
		int maxLen = 0;
		for (int i = 0; i < 20; i++) {
			double ln = Math.random() * (80);
			if (ln > maxLen) {
				maxLen = (int) ln;
			}
//			builder.add(rsg.generator((int) ln) + " ");
			sBuild.append(rsg.generator((int) ln) + "\n");
		}

		System.out.println("New Max Length ::: " + maxLen);
		String fileName = "aTempFile.txt";
		Path path = Paths.get(fileName);

		try {
			Files.write(path.toAbsolutePath(), sBuild.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sBuild.toString());

		letter = builder.build();
		System.out.println(letter.collect(Collectors.toList()));
		try (BufferedReader br = Files.newBufferedReader(path)) {
//			br.lines().forEach(a -> System.out.println(a.toString()));
//			System.out.println("The Count " + br.lines().count());				
			Optional<String> oLW = br.lines().max(Comparator.comparing(String::length));		
			System.out.println("Longest Word :::" + oLW.get());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public int someMethod(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
