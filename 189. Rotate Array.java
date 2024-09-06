// 189. Rotate Array

public void reverse(int[] nums,int start,int end)
    {
        for(int i=start,j=end;i<j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
       
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
