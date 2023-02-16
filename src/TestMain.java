import java.util.Scanner;
import java.util.function.Predicate;

public class TestMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("WELCOME TO TEST MAIN....");
		System.out.println("");

		System.out.println("ENTER YOUR NAME ");
		String name = sc.next();
		System.out.println("ENTER YOUR ID ");
		int id = sc.nextInt();

		Testpojo tp = new Testpojo();
		tp.setName(name);
		tp.setId(id);
		Predicate<String> pr = (str) -> {
			return !str.isEmpty();
		};
		boolean name1 = pr.test(name);
		System.out.println("your NAME " + name + " IS ==>" + name1);

		Predicate<Integer> pr1 = (i) -> {
			return i > 0;
		};
		boolean result1 = pr1.test(id);
		System.out.println("your ID " + id + " IS ==>" + result1);

	}

}
