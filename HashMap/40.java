class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length(), m = t.length();

        if(n!=m){
            return false;
        }

        //Optimal soln
        int[] count = new int[26];

        for(int i = 0; i<n; i++){
            int c1 = s.charAt(i)-97 ;
            int c2 = t.charAt(i) - 97;
            count[c1]++;
            count[c2]--;
        }

        for(int i = 0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;


        //Brute force

        // s = sortString(s);
        // t = sortString(t);

        // return s.equals(t);
        

    }

    // public String sortString(String s){

    //     char[] temp = s.toCharArray();

    //     Arrays.sort(temp);

    //     return new String(temp);
    // }
}
