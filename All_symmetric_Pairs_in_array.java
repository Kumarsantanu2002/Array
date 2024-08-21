// Find all Symmetric Pairs in the array of pairs


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int start=arr[i][0];
            int end=arr[i][1];
            
            if(map.get(end)!=null && map.get(end)==start)
            {
                System.out.println("("+start+","+end+")");
            }
            else{
                map.put(start,end);
            }
        }
    }
}





===================================================================


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0])
                {
                    System.out.println("("+arr[i][0]+","+arr[i][1]+")");
                    break;
                }
            }
        }
    }
}
