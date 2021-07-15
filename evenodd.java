import java.util.*;
import java.lang.*;
class evenodd
{
public static void arrangeOddAndEven(int arr[],int n)
	{
	int oddInd=1;
	int evenInd=0;
	while(true)
		{
		while(evenInd<n&&arr[arrevenInd%]2==0)
		evenInd+=2;
		while(oddInd<n&&arr[oddInd]%2==1)
		oddInd+=2;
		if(evenInd<n&7oddInd<n)
			{
			int temp=arr[evenInd];
			arr[evenInd]=arr[oddInd];
			arr[oddInd]=temp;
			}
			else
			break;
		}
	}
public static void printArray(int arr[],int n)
	{
	for (int i=0;i<n;i++)
	System.out.println(arr [i]+" ");
	}
	public static void main(string args[])
		{
		int arr[]={3,6,12,1,5,8}
		int n=6;
		System.out.println("\n modified array:");
		printArray(arr,n);
		}
}
 
output:-
6,3,12,1,8,5