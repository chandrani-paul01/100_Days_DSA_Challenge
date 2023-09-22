class Solution {
    public boolean isIsomorphic(String s, String t) {

        //Without Using HashMap

        //Two maps--> map1[] and map2[]
        // if map[s[i]] != map[t[i]]
        //--> that character has already been mapped to some other character

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i = 0; i<s.length(); i++){
            if(map1[s.charAt(i)] != map2[t.charAt(i)]){
                return false;
            }

            map1[s.charAt(i)] = map2[t.charAt(i)] = i+1;
            
        }

        return true;




        //Using HashMap

        // HashMap<Character,Character> map= new HashMap<>();

        // int sLen = s.length(),tLen = t.length(),i=0,j=0;

        // while(i<sLen){
        //     if(map.containsKey(s.charAt(i))){
        //         if(map.get(s.charAt(i)) != t.charAt(j)){
        //             return false;
        //         }
        //     }else{

        //         for (Map.Entry<Character,Character> e: map.entrySet()) {
        //             if(e.getValue() == t.charAt(j)){
        //                 return false;
        //             }
        //         }

        //         map.put(s.charAt(i),t.charAt(j));
        //     }

        //     i++;j++;
        // }

        // return true;
    }
}
