// 2149. Rearrange Array Elements by Sign

  public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];

        int ipos=0;
        int ineg=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                neg[ineg++]=nums[i];
            }
            else{
                pos[ipos++]=nums[i];
            }
        }
        ipos=0;
        ineg=0;

       for(int i=0;i<nums.length;i++)
       {
           if(i%2==0){
            nums[i]=pos[ipos++];
           }
           else{
            nums[i]=neg[ineg++];
           }
       }

       return nums;

    }


=======================================================================================================================================
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];

        int ipos=0;
        int ineg=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                neg[ineg++]=nums[i];
            }
            else{
                pos[ipos++]=nums[i];
            }
        }
        ipos=0;
        ineg=0;

       for(int i=0;i<n/2;i++)
       {
          
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        
       }
       return nums;
    }

==============================================================================================================
   public int[] rearrangeArray(int[] nums) {
        int evenpos=0;
        int oddneg=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[evenpos]=nums[i];
                evenpos+=2;
            }
            else{
                 ans[oddneg]=nums[i];
                oddneg+=2;
            }
        }
        return ans;
    }


====================================================================================================================
