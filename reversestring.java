import java.util.*;
class reversestring
{
static void reverse(String s)
{
  Stack<String> stc = new Stack<>();
  String temp = "";
  for(int i = 0; i < s.length(); i++)
  {
    if(s.charAt(i) == ' ')
    {
      stc.add(temp); 
      temp = "";          
    }
   else
    {
      temp = temp + s.charAt(i);
    }
  }
  stc.add(temp);
  while(!stc.isEmpty()) 
  {
    temp = stc.peek();
    System.out.print(temp + " ");
    stc.pop();
  }
  System.out.println();
}
public static void main(String[] args)
{
  String s = "ADITYA";
  reverse(s); 
}
}

Output:-
AYTIDA
