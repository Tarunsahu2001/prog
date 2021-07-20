import java.util.Scanner;
public class ArrayTest 
{
  public static void main(String[] args)
 {
    System.out.print("Enter size of the array: ");
    int n = scan.nextInt();
    int numbers[] = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; ++i) {
      numbers[i] = scan.nextInt();
    }
    System.out.print("Enter number = ");
    int num = scan.nextInt();
    System.out.println("Numbers greater then given number = ");
    display(numbers, num);
    scan.close();
  }
  public static void display(int[] numbers, int num) 
{
    for (int i : numbers) 
{
      if(i > num)
      System.out.print(i+" ");
    }
  }
}

Enter value 20
Output:-
30 40 25 99