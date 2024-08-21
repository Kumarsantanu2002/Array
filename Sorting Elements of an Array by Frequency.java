//Sorting Elements of an Array by Frequency

class Pair{
    int start;
    int end;
    Pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}
class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }
        
       ArrayList<Pair> pairs=new ArrayList<>();
        for(int key:map.keySet())
        {
            pairs.add(new Pair(key,map.get(key)));
        }
        
        Collections.sort(pairs,(a,b)->{
            if(a.end==b.end)
            {
                return a.start-b.start;
            }
            else{
                return b.end-a.end;
            }
        });
        
        for(int i=0;i<pairs.size();i++)
        {
            while(pairs.get(i).end!=0)
            {
                ans.add(pairs.get(i).start);
                pairs.get(i).end--;
            }
        }
        return ans;
    }
}
