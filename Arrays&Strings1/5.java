class Solution {
    public int romanToInt(String str) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        if(str.length()==1){
            return map.get(str.charAt(0));
        }


        int i= 0,sum=0;
        int f = 0, s=0;
        while(i<str.length()){

            f = map.get(str.charAt(i));
            s=0;
            if(i<str.length()-1) s = map.get(str.charAt(i+1));
            
            if(f>=s){
                sum+=f;
                i++;
            }else {
                sum+=s-f;
                i+=2;
            }
        }

        return sum;
    }
}
