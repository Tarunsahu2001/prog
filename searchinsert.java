class Searchinsert
{
    public int searchInsert(int[] nums, int target)
 {
 int i=0; 
    int j=nums.length-1;
    while(i<=j)
{
class
        int mid = (i+j)/2;
        if(target > nums[mid])
{
            i=mid+1;
}
    else if(target < nums[mid]
{
            j=mid-1;    
}
        else
{
            return mid;
        }
    }
    return i;
}       
    }
}

Input: nums = [1,3,5,6], target = 5
Output: 2