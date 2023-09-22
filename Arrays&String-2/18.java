class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(int i = 0; i<details.length; i++){
            int x = details[i].charAt(11)-'0';
            int y = details[i].charAt(12)-'0';

            int age = x*10 + y;
            if(age>60){
                c++;
            }
        }

        return c;
        
    }
}
