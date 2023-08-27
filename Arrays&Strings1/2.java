class Solution {
    public int strStr(String haystack, String needle) { 

        //Without using library functions
        int h = haystack.length(), n = needle.length(),i=0,j=0;

        while(i<h){

            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                if(j==n){
                    return i-j+1;
                }
            }else{
                i=i-j;
                j=0;
            }
            i++;
        }

        return -1;

        //Using library functions
        
        //return(haystack.indexOf(needle));
    }
}
