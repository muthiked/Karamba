
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDater {

	public LocalDater() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World * 10");
		dateFormat();
	}
	private static void dateFormat() {

		LocalDate ld = LocalDate.of(2015, 4, 4);
		System.out.println(ld.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
		System.out.println(ld.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
		System.out.println(ld.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
	}

}
