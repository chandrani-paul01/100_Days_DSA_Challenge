class Solution {

    
    public int numOfPairs(String[] nums, String target) {
        //Brute Force
        int count = 0,n=nums.length;

        for(int i = 0; i<n; i++ ){
            for(int j =0; j<n  ; j++){
                if(i!=j){
                    if(target.equals(nums[i]+nums[j])){
                        count++;
                    }
                }
                
            }
        }
        return count;
    }
}
