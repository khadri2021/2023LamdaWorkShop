
 
import java.util.function.Predicate;
public class PredicateInterfaceExample2 {
    public static void main(String[] args)
    {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
  
        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
        
        boolean result1 = greaterThanTen.and(lowerThanTwenty).test(25);
        System.out.println(result1);
  
  
       }
}