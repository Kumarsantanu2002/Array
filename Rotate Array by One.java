
// Rotate Array by One

public void rotate(int[] arr) {
        // code here
       int size=arr.length;
       int firstele=arr[size-1];
       for(int i=size-1;i>=1;i--)
       {
           arr[i]=arr[i-1];
       }
       arr[0]=firstele;
    }
