import java.util.Optional;

public class ObjectDemo {
	@Override
	public String toString() {
		return "ObjectDemo";
		
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Object> o = Optional.of(new ObjectDemo());
		System.out.println(o.get().toString());
	}

}
