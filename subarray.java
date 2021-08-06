import java.util.*;
class subarray
{
    static int subCount(int arr[], int n, int k)
    {
        int mod[] = new int[k];
        Arrays.fill(mod, 0);
        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];
            mod[((cumSum % k) + k) % k]++;
        }
        int result = 0
        for (int i = 0; i < k; i++)
            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;
                result += mod[0];
                return result;
    }
    public static void main(String[] args)
    {
        int arr[] = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        int n = arr.length;
        System.out.println(subCount(arr, n, k));
        int arr1[] = { 4, 5, 0, -12, -23, 1 };
        int k1 = 5;
        int n1 = arr1.length;
        System.out.println(subCount(arr1, n1, k1));
    }
}

Output: 
7