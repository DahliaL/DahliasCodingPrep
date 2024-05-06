class Solution {
    public boolean isValid(String s) {
        char temp = 'c';
        Stack<Character> assembly = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);

            if(temp == '(' || temp == '{' || temp == '[')
                assembly.push(temp);
            else {
                switch(temp) {
                    case ')':
                        if(assembly.isEmpty() || assembly.peek() != '(')
                            return false;
                        else {
                            assembly.pop();
                            //assembly.pop();
                        }
                        break;
                    case '}':
                        if(assembly.isEmpty() || assembly.peek() != '{')
                                return false;
                            else {
                                assembly.pop();
                               // assembly.pop();
                            }
                            break;
                    case ']':
                        if(assembly.isEmpty() || assembly.peek() != '[')
                                return false;
                            else {
                                assembly.pop();
                               // assembly.pop();
                            }
                            break;
                }
                
            }

        }

        if(assembly.isEmpty())
            return true;
        else
            return false;
    }
}
