// All divisors of a Number

public static void print_divisors(int n) {
      
      Set<Integer> set= new HashSet<>();
      for(int i=1;i<=Math.sqrt(n);i++)
      {
          if(n%i==0)
          {
              set.add(i);
              set.add(n/i);
          }
      }
      
      int[] arr=new int[set.size()];
      int i=0;
      for(int val:set)
      {
          arr[i++]=val;
      }
      
      Arrays.sort(arr);
      for(i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
