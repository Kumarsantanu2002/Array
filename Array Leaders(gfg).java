// Array Leaders
 static ArrayList<Integer> leaders(int n, int arr[]) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        if(n==0)
        {
            return ans;
        }
        ans.add(arr[n-1]);
        int lastlargest=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=lastlargest)
            {
                lastlargest=arr[i];
                ans.add(arr[i]);
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
