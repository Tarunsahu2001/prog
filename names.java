import java.util.*; 
class names
{ 
    public static void countFrequencies(ArrayList<String> list) 
    {
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
        for (String i : list)
 { 
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
        for (Map.Entry<String, Integer> val : hm.entrySet())
 {
          System.out.println("Element " + val.getKey() + " "+ "occurs + ": " + val.getValue() + " times"); 

        } 
    } 
  public static void main(String[] args) 
    {
ArrayList<String> list = new ArrayList<String>(); 

        list.add("Rama"); 
        list.add("githa"); 
        list.add("Rama"); 
        list.add("Lakshmi");
        list.add("Rama");
        list.add("githa");
        list.add("Lakshmi");
        list.add("sita");
        list.add("Lakshmi");
        countFrequencies(list); 

    } 
} 
Output:-
Rama-3
Lakshmi-3