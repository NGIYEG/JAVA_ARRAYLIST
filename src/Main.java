import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Premio");
        cars.add("Prado");
        cars.add("V8");
        cars.add("Toyota");
        cars.add("FH");

        Collections.sort(cars); // Sorting the list
//        In the for loop, i represents each individual car name in the sorted list. You should print i, not cars.
        for(String i:cars){   // Printing each car name
            System.out.println(i);
        }



    }
}