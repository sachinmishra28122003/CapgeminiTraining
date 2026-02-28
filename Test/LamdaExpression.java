import javax.swing.*;
import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

abstract   class temp {
    public abstract   int print(int a);
}
public class LamdaExpression {
    static class Employee {
        String name;
        int empId;

        Employee(int id, String name) {
            this.empId = id;
            this.name = name;
        }
    }

    interface consumer {
        void print(Object ob);
    }

    // Major difference lamda is object in java but in js it is a function
    interface Calc {
        int add(int a, int b);
    }

    // perfectly one abstract  method
    // then only we write lamda expression
    public static void main(String[] arg) {
        Calc c = new Calc() { //  provide an anonymous class for implementing things
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        Calc c2 = (int a, int b) -> {
            return a + b;
        };
        Calc c3 = (a, b) -> a + b; //output in java is object
        temp t = new temp() {
            @Override
            public int print(int a) {
                return a;
            };
        };


        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"ABC"));
        emp.add(new Employee(1000,"DHD"));
        emp.add(new Employee(13876,"OIW"));
        emp.add(new Employee(1765,"KSH"));
        emp.add(new Employee(17574,"DKK"));
        emp.add(new Employee(1,"USR"));
        Consumer<Employee> consumer= ( e) -> { // interface that take some thing and perform some function
            System.out.println(e.empId + "  " + e.name);
        };

        Collections.sort(emp, (e1, e2) -> {
            String nam1 = e1.name.toLowerCase();
            String nam2 = e2.name.toLowerCase();
            return nam1.compareTo(nam2);
        });
        emp.forEach((x) -> System.out.println(x.name + " " + x.empId));
        emp.forEach(System.out::println);
        emp.forEach(consumer);

        // or
        emp.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println("Temp");
            }
        });
        for(Employee e: emp) {
            System.out.println(e.empId + " " + e.name);
        }
        consumer c1 = System.out:: println;

        // Method References ::

        // FUNctio INterfaces
        Function<String, Integer> fun1 = (str) -> str.length();
        //
        Function<String, String> fun2 = (str) ->  str.substring(0,2).toUpperCase();
        System.out.println(fun2.apply("sachin"));

        Supplier<Integer> sup= () -> new Random().nextInt(400);
        for(int i = 1; i <= 10; i ++) {
            System.out.println(sup.get());
        }

        Supplier<Integer> sup2 = new Random()::nextInt;
        Supplier<Double> sup3 = Math::random;

        Predicate<Integer> p = ( a) -> a==1;
        System.out.println(p.test(1));

        // predicate to remove  emp > 150
        emp.removeIf((e) -> e.empId < 100);

        emp.forEach((e) -> System.out.println(e.empId + " " + e.name));
    }

}
