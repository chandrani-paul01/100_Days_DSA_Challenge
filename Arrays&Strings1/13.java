class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int[] left= new int[n];
        int[] right= new int[n];

        left[0] = height[0];
        int lmax = left[0];
        for(int i = 1; i<n;i++){
            if(height[i]>lmax){
                lmax = height[i];
            }
            left[i] = lmax;
        }

        right[n-1] = height[n-1];
        int rmax = right[n-1];
        for(int i = n-2; i>=0; i--){
            if(height[i]>rmax){
                rmax = height[i];
            }

            right[i] = rmax;
        }

        int[] min = new int[n];

        for(int i = 0; i<n; i++){
            min[i] = Math.min(left[i],right[i]);
        }

        int sum=0;

        for(int i=0; i<n;i++){
            sum+= min[i]-height[i];
        }

        return sum;
    }
}
