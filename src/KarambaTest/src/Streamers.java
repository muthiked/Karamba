import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamers {

	public Streamers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Stream.of("Bob", "", "Jane").min((s1, s2) -> s1.compareTo(s2))
				.filter(s -> s.endsWith("n"))
				.orElse("yellow"));
		
		System.out.println(Stream.of("green", "yellow", "blue").min((s0, s2) -> s0.compareTo(s2)));
	   
		List<Integer> number = Arrays.asList(2,4,5,7,8,2,9,4);
		Object sq = number.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(sq);
		
		List<String> words = Arrays.asList("Reflection","Collection","Stream");
		Object sq1 = words.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
		System.out.println(sq1);
		
	}

}
