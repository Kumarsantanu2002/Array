// 31. Next Permutation


  public void reverse(int[] nums,int i,int j)
    {
        for(int low=i,high=j;low<high;low++,high--)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;

        // find the break point
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                idx=i;
                break;
            }
        }

       // if there is no break point.reverse it.
       // bcz we are at the last. we have to go back to the first permutation
        if(idx==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }

        // find the little larger element than the break point element
        // and swap it with the break

        for(int i=nums.length-1;i>idx;i--)
        {
            if(nums[i]>nums[idx])
            {
                // swap
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
                break;
            }

        }
        // reverse the elements after the break point
        reverse(nums,idx+1,nums.length-1);
    }
