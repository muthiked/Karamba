

public class One {

	public One() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 3;
		Integer y = null;
		try {
			System.out.println(Integer.compareUnsigned(x, 3) == 0 || Integer.compareUnsigned(y, 0) == 0);
		}
		catch (Exception ex) {
			System.out.println(ex.getClass().toString());
		}
		try {
			
			System.out.println(y.compareTo(null) == 0 || true);
		}
		catch (Exception ex) {
				System.out.println(ex.getClass().toString());
			}
			
		
	}

}
