class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] map1 = new int[26]; //rn

        int[] map2 = new int[26]; //mag

        int rn = ransomNote.length();
        int mag = magazine.length();

        for(int i = 0; i<rn; i++){
            int ind = ransomNote.charAt(i) - 97;
            map1[ind]++;
        }

        for(int i = 0; i<mag; i++){
            int ind = magazine.charAt(i) - 97;
            map2[ind]++;
        }

        for(int i = 0; i<rn; i++){
            int ind = ransomNote.charAt(i) - 97;
            if(map1[ind] > map2[ind]){
                return false;
            }
        }

        return true;
      
    }
}
