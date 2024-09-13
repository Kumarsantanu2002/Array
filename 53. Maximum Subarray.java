// 53. Maximum Subarray

 public int maxSubArray(int[] nums) {
       int sum=0;
       int maxsum=nums[0];
       for(int i=0;i<nums.length;i++)
       {
           sum=0;
           for(int j=i;j<nums.length;j++)
           {
              sum+=nums[j];
              if(maxsum<sum)
              {
                maxsum=sum;
              }
           }
       }
       return maxsum;
    }

======================================================================================================

   public int maxSubArray(int[] nums) {
       int sum=0;
       int maxsum=nums[0];
       for(int i=0;i<nums.length;i++)
       {
          sum+=nums[i];
          if(maxsum<sum)
          {
            maxsum=sum;
          }
          if(sum<0)
          {
            sum=0;
          }
           
             
       }
       return maxsum;
    }
