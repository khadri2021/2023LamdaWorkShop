import java.util.ArrayList;
import java.util.List;

public class FunctionalProgram {

	public static void main(String[] args) {

		//List<Integer> numbers = List.of(9, 6, 28, 13, 2, 1, 5, 12, 4, 8)<Integer>;
//				of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		
		List<Integer> list=new ArrayList<>();
		
		list.add(11);
		list.add(112);
		list.add(7);
		list.add(9);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(12);
		printAllNumbersInListStructured(list);
		printEvenNumbersInListStructured(list);
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
