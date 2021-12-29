import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    /* Method to check if two hashmaps are equal */
    static boolean checkIfHashMapsAreEqual(Map<Character,Integer> map1, Map<Character,Integer> map2){

        for(Character x: map1.keySet()){
            if(map2.containsKey(x) == false)
                return false;
            if(map2.get(x) != map1.get(x))
                return false;
        }
        return true;
    }

    /* Method to check if two strings are anagrams.
    * Anagram definition:
    * a word, phrase, or name formed by rearranging the letters of another, such as "cinema", formed from "iceman".
    *
    * c:1
    * i:1
    * n:1
    * e:1
    * m:1
    * a:1
    *  */
    static boolean checkIfStringsAnagram(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        char ch;
        for(int i = 0; i < s1.length(); i++){
            ch = s1.charAt(i);
            if(s1Map.containsKey(ch))
                s1Map.put(ch, s1Map.get(ch) + 1);
            else
                s1Map.put(ch, 1);
        }

        for(int i = 0; i < s2.length(); i++){
            ch = s2.charAt(i);
            int previousValue = s2Map.getOrDefault(ch, 0);
            s2Map.put(ch, previousValue + 1);
            //s2Map.put(ch, s2Map.getOrDefault(ch, 0) + 1);
        }
        //System.out.println(s1Map);
        //System.out.println(s2Map);

        //return s1Map.equals(s2Map); // built in equals method
        return checkIfHashMapsAreEqual(s1Map, s2Map); // custom made equals method
    }

    public static void main(String[] args) {

        String s1 = "iceman";
        String s2 = "cinema";
        System.out.println(checkIfStringsAnagram(s1, s2));


        // Hashmap holds key-value pairs <K,V>. Keys must be unique. Values don't need to.
        // Fast operation, time complexity O(1). Know the key, get the value without iterating over the hashmap
        // Hashmap uses object's hashcode to operate. So only works with Objects.
        // Does not work with the primitive types - like int, float, boolean. Instead works with Wrapper Objects- Integer, Float, Boolean
        // autoboxing: Character ch = 'a';
        // unboxing: char a = ch;
        // Map interface - HashMap(no order), LinkedHashMap (insertion order), TreeMap (ordering of keys)

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tugba", 38);
        map.put("Tugba", 15); // replaces the old value
        map.put("Ayse", 20);
        map.put("Fatma", 52);
        map.put("Hayriye", 71);
        //System.out.println(map.get("Tugbaa"));
        //map.remove("Tugba");
        int size = map.size();
        //System.out.println(size);
        boolean containsKey = map.containsKey("Fatmaa");
        //System.out.println(containsKey);
        boolean isEmpty = map.isEmpty();
        //System.out.println(isEmpty);
        //map.clear();
        //System.out.println(map.size());

//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        for(String name:map.keySet())
//            System.out.println(name + " : " + map.get(name));


    }
}
