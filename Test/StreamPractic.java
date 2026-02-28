import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractic {
    public static void main(String[] args){
        List<Integer> list = List.of(23,23,45,34,65,3,46,78,54,23,45);
        Stream<Integer> s = list.stream();
        boolean all_match = s.allMatch((x) -> x > 40);
        System.out.println("All greater than 40   ? : " + all_match);
        boolean anyMatch = list.stream().anyMatch(x -> x > 75);
        System.out.println("Is any student get more than 75  : " +  anyMatch);
        System.out.println(list.stream().count());
        list.stream().distinct().forEach(System.out::print);
        list.stream().filter(x -> x > 40).forEach(System.out::println);
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any);
        Stream<Double> percentage = list.stream().filter(x -> x >= 40).map(i-> i/10.0);
        percentage.forEach(System.out::print);
        Set<Integer> result = list.stream().filter(x -> x > 40).collect(Collectors.toSet());
        System.out.println(result);
    }
}
