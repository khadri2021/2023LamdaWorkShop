import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		  Predicate<String> p = (msg) -> msg.equals("Good Morning");
		  System.out.println(p.test("Good Morning"));
		  System.out.println(p.test("Good Evening"));

		
	}

}
