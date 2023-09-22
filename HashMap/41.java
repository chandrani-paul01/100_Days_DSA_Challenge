class Solution {
    public int[] twoSum(int[] nums, int target) {

       

     //Optimal

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < n; i++) {
            int key = target-nums[i];
            if(map.containsKey(key) && map.get(key)!=i){
                return new int[]{i,map.get(key)};
            }
        }

        //Brute

        // for(int i = 0 ; i<nums.length; i++){
        //     int x = nums[i];
        //     for(int j = 0; j<nums.length && j!=i ; j++){
        //         if(target-x == nums[j]){
        //             return new int[]{i,j};
        //         }
        //     }
        // }

        // return new int[]{-2,-2};
        
    }
}
