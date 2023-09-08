class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern){
        
        List<String> ans = new ArrayList<>();

        for(int i = 0; i<words.length; i++){
            if(isIsomorphic(pattern,words[i])){
                ans.add(words[i]);
            }
        }

        return ans;
    }

    boolean isIsomorphic(String pat, String word){
        if(pat.length() != word.length()){
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i = 0; i<pat.length(); i++){
            if(map1[pat.charAt(i)] != map2[word.charAt(i)]){
                return false;
            }

            map1[pat.charAt(i)] = i+1;
            map2[word.charAt(i)] = i+1;

        }

        return true;
        
    }
}
