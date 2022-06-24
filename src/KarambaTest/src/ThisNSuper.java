

class SuperCar{
	String testing = "500";
	public SuperCar() {
		System.out.println("This is FIAT");
	}
	

	public SuperCar(String s) {
		System.out.println(s);
	}
	

	public SuperCar(String s, int n) {
		System.out.println(s + "4444    " + n);
	}
	
	public String testing() {
		return "500";
	}
}

public class ThisNSuper extends SuperCar{
	public ThisNSuper(){
		super("Camarro");
//		System.out.println("Toys over here");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCar sc = new ThisNSuper();
		SuperCar sc1 = new SuperCar("A goddamn Doge");
		SuperCar sc2 = new SuperCar("Ford", 2014);
		sc1.testing();
		ThisNSuper tns = new ThisNSuper();
		tns.testThis();
	}
	
	public void testThis() {
		System.out.println("This::::::"  + this.testing());
		System.out.println("Super:::::"  + super.testing());
		
	}
	
	public String testing() {
		return "100";
		
	}

}
