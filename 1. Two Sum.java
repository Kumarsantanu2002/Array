// 1. Two Sum

public int[] twoSum(int[] nums, int target) {
			int arr[]=new int[2];
          for (int i=0;i<nums.length;i++){
						for(int j=i+1;j<nums.length;j++){
							  if(nums[i]+nums[j]==target){
									arr[0]=i;
									arr[1]=j;
								}
						}
					}
					return arr;
		}
================================================================================================================
public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int required=target-nums[i];
            if(map.containsKey(required))
            {
                ans[0]=map.get(required);
                ans[1]=i;
                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }

==================================================================================================================
