//Replace elements by its rank in the array

static int[] replaceWithRank(int arr[], int N) {
     // code here
     int ans[]=new int[N];
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<N;i++)
     {
         ans[i]=arr[i];
     }
     Arrays.sort(ans);
     int j=1;
      for(int i=0;i<N;i++)
     {
        if(!map.containsKey(ans[i]))
        {
             map.put(ans[i],j++);
        }
       
     }
     for(int i=0;i<N;i++)
     {
         ans[i]=map.get(arr[i]);
     }

    return ans;
  }
