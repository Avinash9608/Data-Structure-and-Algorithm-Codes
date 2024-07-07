package dsa.expression6;

import java.util.Stack;

public class Convert {
    private String infix, postfix;

    public Convert(String infix) {
        this.infix = infix;
        postfix="";
    }

    public void toPostFix()
    {
        Stack<Character> st=new Stack<>();
        for (int i=0;i<infix.length();i++)
        {
            char ch=infix.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }else if(ch==')')
            {
                while (st.peek()!='(')
                {
                    postfix=postfix+st.pop();
                }
                st.pop();
            }
            else if(isOperand(ch)==true)
            {
                postfix=postfix+ch;
            }else
            {
                while (st.empty()==false)
                {
                    if(st.peek()=='(')
                        break;
                   if(precedence(ch)>precedence(st.peek()))
                        break;
                    postfix=postfix+st.pop();
                }
                st.push(ch);
            }
        }
        while (st.empty()==false)
        {
            postfix=postfix+st.pop();
        }
    }

    public boolean isOperand(char ch)
    {
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57)
            return true;
        return false;
    }
    public int precedence(char op)
    {
        if (op=='$')
            return 3;
        else if (op=='/' || op=='%' || op=='*')
            return 2;
        else if (op=='+' || op=='-')
            return 1;
        else
            return 0;
    }


    @Override
    public String toString() {
        return "infix=" + infix +
                ", postfix=" + postfix;
    }
}

