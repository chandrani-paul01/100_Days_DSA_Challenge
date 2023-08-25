class Solution {
    public int removeElement(int[] nums, int val) {
        
        int c = 0,count=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == val) count++;
        }


        //moving the 'val' to the end
       for(int i = 0; i<nums.length; i++){
          if(nums[i] != val){
              int temp = nums[i];
              nums[i] = nums[c];
              nums[c] = temp;
              c++;
          }
      }
        return nums.length - count;
    }
}
