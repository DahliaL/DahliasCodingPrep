class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == "") // base case
            return s;

        Stack<Character> paren = new Stack<Character>();
        String ans = "";

        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if( Character.isLetterOrDigit(temp) )
                ans = ans + temp;
            else {
                if(temp == '(') {
                    paren.push('('); 
                    ans = ans + temp;
                    }
                else { // it's a ) !
                    if(paren.isEmpty())
                        continue; // dont add the ) in
                    else if(!paren.isEmpty() && paren.peek() == '(') {
                        ans = ans + temp;
                        paren.pop(); 
                        }
                    else {
                        
                    }
                }
            }
        }

        ArrayList<Character> leftover = new ArrayList<Character>();

        System.out.println(paren.size());

        while(!paren.isEmpty()) {
            leftover.add(paren.pop());
        }

        System.out.println(leftover);

        while(leftover.size() > 0) {
            char curr = leftover.get(leftover.size()-1);

            if(ans.length() == 2) {
                if(ans.indexOf(curr) == 0)
                    ans = ans.substring(1);
                else
                    ans = ans.substring(0, 1);
            } else if (ans.length() == 1)
                return "";
            else {
                if(ans.lastIndexOf(curr) == ans.length()-1)
                    ans = ans.substring(0, ans.length()-1);
                else
                    ans = ans.substring(0, ans.lastIndexOf(curr)) + ans.substring(ans.lastIndexOf(curr)+1);
            } 

            leftover.remove(leftover.size()-1);
        }

        return ans;
    }
}
