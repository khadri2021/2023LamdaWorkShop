import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
		Predicate<String> containsJava = t1 -> t1.contains("java");
		Predicate<String> containsSpring = t2 -> t2.contains("spring");
		System.out.println(containsJava.and(containsSpring).test("one of the trending language is java"));
		System.out.println(containsJava.and(containsSpring).test("spring is framework on top of Core java."));
	}
}
