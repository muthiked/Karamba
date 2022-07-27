
import java.util.Formatter;

public class two {

	public two() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10, j = 12;
		for(;;) {
			if(i++ < j --)
				continue;
			else
				break;
//			System.out.println(i + " " + j);
		}
		
		String sA = "A";
		String sB = "B";
		String sN = null;
		StringBuilder bf = new StringBuilder("C");
		Formatter f = new Formatter(bf);
		f.format("%s%s", sA, sB);
		System.out.println("L1" + f);
		f.format("%-2s",sB);
		System.out.println("L2" + f);
		f.format("%b", sA, sN);
		System.out.println("L3" + f);
		
		Formatter f2=new Formatter();
		f2.format("%3$3s %1$3s %2$3s", "fear",
				   "strengthen", "weakness");
				System.out.println(f2);
		
		
	}

}
