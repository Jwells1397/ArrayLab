import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static boolean main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);  // Sort cars
        for (String i : scottishIslands) {
            System.out.println(i);
        }
//        9. Print out all the islands using a for loop
        for (String i : scottishIslands) {
            System.out.println(i);
            System.out.println();
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }


        }

//        2. Print the difference between the largest and smallest value
        int max_num = Collections.max(numbers);
        System.out.println(max_num);
        int min_numb = Collections.min(numbers);
        System.out.println(max_num - min_numb);
//        3. Print true if the list contains a 1 next to a 1 somewhere

        if(numbers.contains(1)){
            System.out.println("(numbers contains 1) true");
        }



//        4. Print the sum of the numbers

            int sumOfNumbers = 0;
                for (int number : numbers){
                    sumOfNumbers += number;
                }
                System.out.println("Sum of numbers: " + sumOfNumbers);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

                int index = 0;
                int total = 0;
                for (int number : numbers){
                    if(number == 13 || numbers.get(index) == 13){ // once it hits 13, the index no longer increments
                        continue;
                    } else {
                        total += number;
                        index += 1;
                    }
                }
                System.out.println("Sum of numbers (no 13!): " + total);




    }}