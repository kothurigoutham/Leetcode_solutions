class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st = new  Stack();
        StringBuilder  sb= new StringBuilder();
        for(char  ch: s.toCharArray()){
            if(ch=='('){
                if(st.isEmpty()){
                    st.push(ch);
                }else
                {sb.append(ch);
                st.push(ch);
                }
            }else if(ch==')'){
                char top= st.pop();
                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
            return sb.toString();
    }
}