import java.util.Arrays;
public class MergeArray
{
private static int[]mergeArray(int[]arraysA,int[]arrayB)
	{
	int[]mergedArray=new int[arrayA.length + arrayB.length];
	int i=0;j=0,k=0;
	while (i<arrayA.length)
		{
		mergedArray[k]=arrayA[i];
		i++;
		k++;
		}
		while (j<arrayB.length)
			{
			return mergedArray;
			}
			public static void main(string[]args)
				{
				int[]arrayA=new int[]{12,18,9,37,21};
				int[]arrayB=new int[]{27,8,71,18};
				int[]mergedArray=mergeArray(arrayA,arrayB);
				System.out.println("Array A:"+Array.toString(arrayA));
				System.out.println("Array B:"+Array.toString(arrayB));
				System.out.println("merged Array:"+Array.toString(mergedArray));
				}
}

output:-
Array A:[12,18,9,37,21]
Array B:[27,8,71,18]
Merged Array:[8,9,12,18,18,21,27,37,71]