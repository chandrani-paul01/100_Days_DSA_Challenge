class Solution {
    public int garbageCollection(String[] garbage, int[] nums) {

        //Using Prefix Sum
        int n = garbage.length;
        int[] prefix = new int[n+1];
        int sum = nums[0];
        for(int i = 1;i<n;i++ ){
            prefix[i] = prefix[i-1]+nums[i-1];
        }

        int gCount = 0,lg=-1;
        int pCount = 0,lp=-1;
        int mCount = 0,lm=-1;

        for(int i = 0; i<n; i++){
            String s = garbage[i];
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j) == 'G'){
                    gCount++;
                    lg = i;
                }else if(s.charAt(j) == 'P'){
                    pCount++;
                    lp = i;
                }else{
                    mCount++;
                    lm = i;
                }
            }
        }
 
        int totCount =0;
        if(lg!=-1) totCount += gCount+prefix[lg];
        if(lp!=-1) totCount += pCount+prefix[lp];
        if(lm!=-1) totCount += mCount+prefix[lm];

        return totCount;
        



        //Brute Force --> Using count array
      
        // int n = garbage.length;
        // int[] glass = new int[n];
        // int[] paper = new int[n];
        // int[] metal = new int[n];

        // for(int i = 0; i<n; i++){
        //     String s = garbage[i];
        //     for(int j = 0; j<s.length(); j++){
        //         if(s.charAt(j) == 'G'){
        //             glass[i]++;
        //         }else if(s.charAt(j) == 'P'){
        //             paper[i]++;
        //         }else{
        //             metal[i]++;
        //         }
        //     }
        // }

        // int glassCount = 0;
        // int paperCount = 0;
        // int metalCount = 0;

        // int g = n-1;
        // while(g>=0 && glass[g] == 0){
        //     g--;
        // }

        // int p = n-1;
        // while(p>=0 && paper[p] == 0){
        //     p--;
        // }

        // int m = n-1;
        // while(m>=0 && metal[m] == 0){
        //     m--;
        // }

        // for(int i = g; i>=0; i--){
    
        //     if(i==0) {
        //         glassCount+= glass[i];
        //     }
        //     else{
        //         glassCount+= glass[i] + nums[i-1];
        //     }
        // }

        // for(int i = p; i>=0; i--){
    
        //     if(i==0) {
        //         paperCount+= paper[i];
        //     }
        //     else{
        //         paperCount+= paper[i] + nums[i-1];
        //     }
        // }

        // for(int i = m; i>=0; i--){
    
        //     if(i==0) {
        //        metalCount+=metal[i];
        //     }
        //     else{
        //         metalCount+= metal[i] + nums[i-1];
        //     }
        // }
        
        // return glassCount+paperCount+metalCount;
    }
}
