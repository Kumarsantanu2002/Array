// 75. Sort Colors

public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else if(nums[i]==1)
            {
                one++;
            }
        }
        int two=nums.length-zero-one;

      int i=0;
        while(i<zero){
                nums[i++]=0;
        }

        while(i<zero+one)
        {
            nums[i++]=1;
        }
        while(i<nums.length)
        {
            nums[i++]=2;
        }  
    }


========================================================================================================

   public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=nums.length-1;
        while(one<=two)
        {
            if(nums[one]==0)
            {
                swap(nums,zero,one);
                one++;
                zero++;
            }
          else if(nums[one]==1)
            {
                one++;
            }
            else if(nums[one]==2)
            {
                swap(nums,one,two);
                two--;
            }  
        }
    }
