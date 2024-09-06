// Second Largest

  public int print2largest(int[] arr) {
        
        int max=arr[0];
        int secondmax=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]<max)
            {
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
