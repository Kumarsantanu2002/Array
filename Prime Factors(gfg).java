// Prime Factors

 public int[] AllPrimeFactors(int N)
    {
        Set<Integer> set=new HashSet<>();
        int num=N;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
                while(num>1 && num%i==0)
                {
                    set.add(i);
                    num/=i;
                }
        }
        if(num>1)
        {
            set.add(num);
        }
        int size=set.size();
        int[] ans=new int[size];
        int j=0;
        for(int value:set)
        {
            ans[j++]=value;
        }
        
        Arrays.sort(ans);
        return ans;
    }
