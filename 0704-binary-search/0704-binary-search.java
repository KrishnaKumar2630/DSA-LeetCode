class Solution {
    public int search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length-1);
        
    }
    public int BinarySearch(int[]nums,int target,int low, int high)
    {
    // Base Case  
      if(low>high)
      return -1;

      int mid = low+(high-low)/2;

      if(target==nums[mid])
      return mid;

      else if (target>nums[mid])
     return  BinarySearch(nums,target,mid+1,high);
      
      else
       return BinarySearch(nums,target,low,mid-1);
    }
}