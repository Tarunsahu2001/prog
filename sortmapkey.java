import java.util.*;
class sortmapKey
 {
    static Map<String, Integer> map = new HashMap<>();
    public static void sortbykey()

    {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) 

            System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());        

    }
    public static void main(String args[])
    {
        map.put(5, "john");
        map.put(1,"sam");
        map.put(7,"kim");
        sortbykey();

    }
}
output:-
1 sam
5 john
7 kim