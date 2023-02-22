import java.util.ArrayList;
import java.util.List;

public class FunctionalProgram1 {

	public static void main(String[] args) {

		 
		
		List<Integer> list=new ArrayList<>();
		
		list.add(11);
		list.add(112);
		list.add(7);
		list.add(9);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(12);
		list.add(56);
		printAllNumbersInListStructured(list);
		printEvenNumbersInListStructured(list);
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
