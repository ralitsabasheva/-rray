import java.util.*;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity of array");
        int capacity = scanner.nextInt();
        ArrayList<Integer> arraylist = new ArrayList<Integer>(capacity);
        int i;
        for (i = 0; i < capacity; i++) {
            System.out.println("Enter element  " + i);
            arraylist.add(i, scanner.nextInt());
        }
        System.out.println(arraylist.toString());
        arraylist.remove(2);
        System.out.println(arraylist);
        arraylist.add(2, 4);
        System.out.println(arraylist);
        Set set = new LinkedHashSet();
        set.addAll(arraylist);
        arraylist.clear();
        arraylist.addAll(set);
        System.out.println("ArrayList without duplicate elements: " + arraylist);
        Optional<Integer> max = arraylist.stream().max(Integer::compare);
        if (max.isPresent()) {
            arraylist.remove(max.get());
        }
        Optional<Integer> max1 = arraylist.stream().max(Integer::compare);
        if (max1.isPresent()) {
            System.out.println("Тhe second largest element is " + max1.get());
            System.out.println(arraylist);

            Optional<Integer> min = arraylist.stream().min(Integer::compare);
            if (min.isPresent()) {
                arraylist.remove(min.get());
            }
            Optional<Integer> min1 = arraylist.stream().min(Integer::compare);
            if (min1.isPresent()) {
                arraylist.remove(min1.get());
            }
            System.out.println("The second smallest element is  " + min1.get());
        }
    }
}
