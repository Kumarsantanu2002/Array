//128. Longest Consecutive Sequence


// this exceeds the time limit but it is the brute force
public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        int maxcount=1;
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            count=1;
            int ele=nums[i]+1;
            while(set.contains(ele))
            {
                count++;
                ele=ele+1;
            }

            if(count>maxcount)
            {
                maxcount=count;
            }
          

        }
        return maxcount;
    }


===============================================================================================================

   public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int count=0;
        int longestseq=0;
        int lastseq= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastseq)
            {
                count++;
                lastseq=nums[i];
            }
            else if(nums[i]!=lastseq)
            {
                count=1;
                lastseq=nums[i];
                
            }
            longestseq=Math.max(count,longestseq);
        }
        return longestseq;
    }


=======================================================================================================================================

   public int longestConsecutive(int[] nums) {
        
         if(nums.length==0)
        {
            return 0;
        }
        
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        int maxcount=1;
        for(int val:set)
        {
            if(!set.contains(val-1))
            {
                int count=1;
                int x=val;
                while(set.contains(x+1))
                {
                    x=x+1;
                    count++;
                }
                maxcount=Math.max(maxcount,count);
            }
        }
        
        return maxcount;
    }
