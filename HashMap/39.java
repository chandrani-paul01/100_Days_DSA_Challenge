class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] str_arr = s.split(" ");

        if(pattern.length() != str_arr.length) return false;

        for(int i = 0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i)) ){
                 if( !map.get(pattern.charAt(i)).equals(str_arr[i])) {
                    return false;
                }
            }
            else{
                for (Map.Entry<Character,String> el : map.entrySet()){
                    if(str_arr[i].equals(el.getValue())){
                        return false;
                    }
                }
                map.put(pattern.charAt(i),str_arr[i]);
            }
        }

        return true;
    }
}
