import java.util.concurrent.*;

public class Threes {

	public static int dSF() { System.out.println("G"); return 5 ;}
	public static int hSF() { System.out.println("H"); return 6 ;}
	public static int uSF() { System.out.println("U"); return 7 ;}
	public static int mSF() { System.out.println("M"); return 8 ;}
	public static int job() { System.out.println("J"); return 9 ;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Threes t = new Threes(() -> dSF()
//					.thenApply( x -> hSF())
//					.thenApply( y -> uSF())
//					.thenApply( z -> mSF())
//					.exceptionally(a -> job()));
//			System.out.println(t.get());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
