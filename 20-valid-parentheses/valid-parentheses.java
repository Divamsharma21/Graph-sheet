// class Solution {
//     public boolean isValid(String s) {

// Stack<Character> st = new Stack<>();
// if (s == null || s.length() == 0)
//     return true;
// for (int i = 0; i < s.length(); i++) {

//     if (s.charAt(i) == '[' || s.charAt(i) == '{'
//             || s.charAt(i) == '(') {
//         st.push(s.charAt(i));
//     }

//     else if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') {
//         if (!st.isEmpty() && (st.peek() == '(' ||   st.peek() == '{'
//                 ||   st.peek() == '[')) {
//             st.pop();
//         } else {
//             return false;
//         }
//     }

// }
// if (st.isEmpty()) {
//     return true;
// } else {
//     // If there are unmatched open symbols left in the stack, the string is invalid
//     return false;
// }
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty())return false;
                char a=st.pop();
                 if(a=='(' && s.charAt(i)==')' ||a=='[' && s.charAt(i)==']' || a=='{' && s.charAt(i)=='}'   )continue;
            
            else{
                return false;

            }
            }

        }
        return st.isEmpty();
    }
}