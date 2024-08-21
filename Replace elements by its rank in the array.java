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


==========================================================================
     import java.util.*;
public class Main {
  public static void main(String args[]) {
    int n = 6;
    int arr[] = {20,15,26,2,98,6};
    for (int i = 0; i < n; i++) {
      Set < Integer > s = new HashSet < Integer > ();
      for (int j = 0; j < n; j++) {
        if (arr[j] < arr[i]) {
          s.add(arr[j]);
        }
      }
      int rank = s.size() + 1;
      System.out.print(rank + " ");
    }
  }
}
