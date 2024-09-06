// 1752. Check if Array Is Sorted and Rotated


 public boolean check(int[] nums) {
        // in rotated array only one pair of element is present
        // where previous ele is greater than curr element
        // in all equal elements no pair will be present

       int count=0;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]>nums[i])
        {
            count++;
        }
       }
       if(nums[nums.length-1]>nums[0])
       {
        count++;
       }
        
        return count<=1;


    }
