import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Replacer {

	public Replacer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rep("aaabaa", 'a').toString());
		repStream("aaabaa", 'a');
	}
	
	public static StringBuilder rep(String x , char y) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < x.length();i++) {
			if(x.charAt(i) != y) {
				sb.append("-");
			}else {
				sb.append(Character.toString(y));
			}
		}
		return sb;
	}
	
	public static void repStream(String x, char y){
//		x.chars()
//				.forEach(s -> {if(s != y) {{String.replace((char}s, '-'))
//					System.out.println((char)s);}
//				});			
	}
}