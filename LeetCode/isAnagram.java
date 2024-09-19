class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false; 

        char[] sWord = s.toCharArray();
        char[] tWord = t.toCharArray();

        Arrays.sort(sWord);
        Arrays.sort(tWord);
        
        return Arrays.equals(sWord, tWord);
    }
}
