class Solution {
    public int mostWordsFound(String[] sentences) {

        //Optimal - Using split() method

        int max = 0;
        for(int i = 0; i<sentences.length; i++){
            int currLen = sentences[i].split(" ").length;
            max = Math.max(max,currLen);
        }

        return max;


        //Brute force
        // int maxi=0,c;
        // for(int i =0; i<sentences.length; i++){
        //     c=1;
        //     for(int j=0; j<sentences[i].length(); j++){
        //         if(sentences[i].charAt(j) == ' '){
        //             c++;
        //         }
        //     }
        //     maxi = Math.max(maxi,c);
        // }

        // return maxi;
    }
}
