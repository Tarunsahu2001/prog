import java.util.Arrays;
 

class countfrequncies
{

public static void countFreq(int arr[], int n)
{

    boolean visited[] = new boolean[n];
    Arrays.fill(visited, false);
    for (int i = 0; i < n; i++) {
        if (visited[i] == true)

            continue;
        int count = 1;

        for (int j = i + 1; j < n; j++) {

            if (arr[i] == arr[j]) {

                visited[j] = true;

                count++;

            }

        }

        System.out.println(arr[i] + " " + count);

    }
}
public static void main(String []args)
{

    int arr[] = new int[]{ 2,3,4,5,4,6,4,7,4,5,6,6};

    int n = arr.length;

    countFreq(arr, n);
}
}

Output:-
4 - 4
5 - 2
6 - 3