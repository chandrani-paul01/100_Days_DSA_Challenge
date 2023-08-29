class Solution {
    public int maxProfit(int[] arr) {
        
        //O(n) approach
        int minBuy = arr[0];
        int max = 0;

        for(int i = 1; i<arr.length; i++){
            max = Math.max(max,arr[i]-minBuy);
            minBuy = Math.min(minBuy,arr[i]);
        }

        return max;

        //O(n2) approach

        // int max = 0;
        // for(int i = 0; i<arr.length; i++){
        //     int buy = arr[i];
        //     for(int j = i+1; j<arr.length; j++){
        //         int sell = arr[j];
        //         max = Math.max(max,sell-buy);
        //     }
        // }

        // return max;

    }
}  
