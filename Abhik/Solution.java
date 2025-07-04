package Abhik;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> s=new Stack<>();
        for(String st:tokens){
            if(st.equals("+")){
                int a =s.pop();
                int b=s.pop();
                s.push(a+b);
            }
            else if(st.equals("-")){
                int a =s.pop();
                int b=s.pop();
                s.push(b-a);

            }
            else if(st.equals("*")){
                int a =s.pop();
                int b=s.pop();
                s.push(a*b);
            }
            else if(st.equals("/")){
                int a =s.pop();
                int b=s.pop();
                s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(st));
            }

        }
        return s.pop();
    }
    public static void main(String[] args) {
        Solution o=new Solution();
        String a[]={"1","2","+","3","*","4","-"};
        System.out.println(o.evalRPN(a));
        

    }
}
