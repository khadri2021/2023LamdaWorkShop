package predicateandfunction;

import java.util.Scanner;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ENTER YOUR CAR NAME");
		String name = sc.next();
		System.out.println("ENTER YOUR AMOUNT");
		int amount = sc.nextInt();
		Predicate<String> pr = (str) -> {
			return !str.isEmpty();
		};
		boolean name1 = pr.test(name);

		Function<Register, RegId> function = (reg) -> {
			String uniqueId = UUID.randomUUID().toString().toUpperCase();
			RegId rId = new RegId(uniqueId);
			rId.setName(reg.getName());
			rId.setAmount(reg.getAmount());

			return rId;

		};
		Register re = new Register();
		re.setName(name);
		re.setAmount(amount);

		RegId newId = function.apply(re);
		System.out.println("YOUR CAR REGID NUMBER : " + newId.getRegId());
		System.out.println("YOUR ID CAR NAME : " + newId.getName());
		System.out.println("YOUR ID AMOUNT : " + newId.getAmount());
		System.out.println("<====  THANK YOU   ====>");
	}
}
