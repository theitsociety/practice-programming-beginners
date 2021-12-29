import java.util.*;

public class HashSetBasics {

    public static void main(String[] args) {
        // (1,2,3,4,5)
        // ("aaa","b","ccc"); Set<String> numSet = new HashSet<>();

        // HashSet is unordered (neither ordered by insertion or value, values are stored in random order)
        // LinkedHashSet is sorted by insertion order: Set<Integer> numSet = new LinkedHashSet<>();
        // TreeSet is ordered by value ASC: Set<Integer> numSet = new TreeSet<>();
        HashSet<Integer> numSet = new HashSet<>();
        numSet.add(55);
        numSet.add(2);
        numSet.add(-1);
        numSet.add(-10);

        System.out.println("Trying to add a non-existing value to the set. It returns: " + numSet.add(0));
        System.out.println("Trying to add a duplicate value to the set. It returns: " + numSet.add(-1));

        for(int x: numSet)
            System.out.println(x);

        int num = 2;
        boolean flag = numSet.contains(num);
        System.out.println("Set contains num " + num + " ?: " + flag);

        num = 20;
        flag = numSet.remove(num);
        System.out.println("Trying to delete num " + num + " ?: " + flag);


        System.out.println("Size of the hash set before emptying the set is: " + numSet.size());

        numSet.clear();

        System.out.println("Size of the hash set after emptying the set is: " + numSet.size());


        flag = numSet.isEmpty();
        System.out.println("Let's see if the set is empty: " + flag);

        Set<Integer> s1 = new LinkedHashSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();

        s1.add(1);
        s1.add(2); //(1,2)

        s2.add(2);
        s2.add(1); //(2,1)

        System.out.println(s1.equals(s2));

        // we could simply initialize a hash set like this:
        Set<Character> vowels = new HashSet<>(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
        Set<Character> vowelsSorted = new TreeSet<>(Arrays.asList(new Character[]{'e','i','a', 'o','u','A','E','I','O','U'}));

        for(char c: vowelsSorted)
            System.out.print(c + " ");


    }
}
