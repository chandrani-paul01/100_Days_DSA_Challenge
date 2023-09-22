class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }
        
        int i = 0, j = s.length()-1;
        s = s.toLowerCase();

        while(i<=j){
            if(!Character.isLetterOrDigit(s.charAt(i)) ){
                i++;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if( Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) {

                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }else{
                    i++;j--;
                }
            }

            
        }

    return true;
    }
}
