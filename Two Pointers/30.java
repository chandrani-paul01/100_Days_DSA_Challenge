class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1,sum=0;

        while(i<j){
             sum = numbers[i] + numbers[j];
            if(target<sum){
                j--;
            }else if(target>sum){
                i++;
            }else{
                return  new int[]{i+1,j+1};
            }
        }

        return  new int[]{-1,-1};
    }
}
