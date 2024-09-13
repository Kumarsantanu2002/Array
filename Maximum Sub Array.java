// Maximum Sub Array
 ArrayList<Integer> findSubarray(int n, int a[]) {
        
       int currsum=0;
       int maxsum=0;
       int currstart=0;
       int currend=0;
       int maxstart=0;
       int maxend=0;
      
      for(int i=0;i<a.length;i++)
      {
          if(a[i]<0)
          {
              currsum=0;
              currstart=i+1;
          }
          else{
              currsum+=a[i];
              
          }
          
          
          if(currsum>maxsum)
          {
              maxsum=currsum;
              maxstart=currstart;
              maxend=i;
          }
          else if(currsum==maxsum)
          {
              int currdist=i+1-currstart;
              int maxdist=maxend+1-maxstart;
              if(currdist >maxdist)
              {
                  maxstart=currstart;
                  maxend=i;
              }
          }
          
      }
      
      ArrayList<Integer> ans=new ArrayList<>();
      for(int i=maxstart;i<=maxend;i++)
      {
          ans.add(a[i]);
      }
      
      if(ans.size()==0)
      {
          ans.add(-1);
      }
     
      
      return ans;
        
    }
