class RemoveConsecutiveCharacter
{
    public String removeConsecutiveCharacter(String S){
        String s="";
        Stack<Character> st = new Stack<Character>();
        st.push(S.charAt(0));
        for(int i=1; i<S.length();i++){
            char temp = st.peek();
            if(S.charAt(i)==temp){
                continue;
            }
            else{
                
                st.push(S.charAt(i));
                
            }
            
        }
        for(char ch : st){
            s=s+ch;
        }
        return s;
    }
}
