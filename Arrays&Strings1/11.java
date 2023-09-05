class Solution {
    public String reverseWords(String S) {
       
        S = S.trim();

        int end = S.length();
        StringBuffer ans = new StringBuffer();

        for(int i = S.length()-1 ; i>=0; i--){
            if(S.charAt(i) == ' '){
                ans.append(S,i,end);
                end = i;
            }
        }

        ans.append(' ');
        ans.append(S,0,end);
        
        return ans.toString().replaceAll(" +"," ").trim();
        
    }

    //Reversing each word and then reversing the entire String

    //public String reverseWords(String S){

        // int start = 0;
        // char[] str = S.toCharArray();
        
        // for(int i = 0; i<S.length(); i++){
        //     if(S.charAt(i) == ' '){
        //         reverse(str,start,i-1);
        //         start=i+1;
        //     }
        // }
        
        // reverse(str,start,S.length()-1);
        // reverse(str,0,S.length()-1);

        // return new String(str).replaceAll(" +"," ").trim();


    //}
    
    // void reverse(char[] str, int start,int end){
    //     while(start<=end){
    //         char temp = str[start];
    //         str[start] = str[end];
    //         str[end] = temp;
    //         start++;end--;
    //     }
    // }



    //Using Stack
        
    //     Stack<String>  stack = new Stack<>();
    //      String str="";

    //     for(int i = 0; i<s.length(); i++){
    //         if(s.charAt(i) == ' ' && !str.equals("")){
    //             stack.push(str);
    //             str = "";
    //         }else if(s.charAt(i) != ' '){
    //             str +=s.charAt(i);
    //         }
    //     }

    //     stack.push(str);
      

    //     String ans = "";

    //     while(!stack.isEmpty()){
    //         String temp = stack.pop();
    //         ans+=temp+" ";
    //    }

    //     return ans.trim();
    // }
}
