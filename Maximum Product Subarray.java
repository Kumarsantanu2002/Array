// Maximum Product Subarray

long maxProduct(int[] arr, int n) {
        long maxproduct=Long.MIN_VALUE;
        long product=1;
        
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
            if(product>maxproduct)
            {
                maxproduct=product;
            }
            
            if(product==0)
            {
                product=1;
            }
        }
    
     
        product=1;
        for(int i=arr.length-1;i>0;i--)
        {
            product*=arr[i];
            if(product>maxproduct)
            {
                maxproduct=product;
            }
            
            if(product==0)
            {
                product=1;
            }
        }
        
        
        return maxproduct;
        
        
    }
