
// first run of it
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t))
            return true;

        HashMap<Character, Character> letterMap = new HashMap<>();
        HashSet<Character> uniq = new HashSet<>();
        String mappedWord = "";

        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);


            if(letterMap.containsKey(temp)) {
                mappedWord = mappedWord + letterMap.get(temp);
            } else{

                if(uniq.contains(t.charAt(i)))
                    return false;

                letterMap.put(temp, t.charAt(i));
                uniq.add(t.charAt(i));
                mappedWord = mappedWord + t.charAt(i);
            }
        }

        if(mappedWord.equals(t))
            return true;

        return false;
    }
}
