
public class Factoriz {

	public Factoriz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myFacto(3,1));
	}
	
	private static int myFacto (int n, int r) {
		int x = fact(n)/fact(n-r);
		return x;
	}
	
	private static int fact (int n) {
		int i = 1;
		int j = 1;
		while(j <= n) {
			i = i*j;
			j++;
		}
		return j;
	}

}
