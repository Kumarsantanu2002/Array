// 283. Move Zeroes

public void swap(int[] nums,int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int i=-1;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                i=j;
                break;
            }
        }
        if(i==-1)
        {
            return ;
        }
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                swap(nums,i,j);
                i++;
            }

        }

    }
