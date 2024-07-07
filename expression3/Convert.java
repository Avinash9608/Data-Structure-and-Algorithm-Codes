package dsa.expression3;

import CodeToGether.WallPainting;

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
            if(isOperand(ch)==true)
            {
                postfix=postfix+ch;
            }else
            {
                while (st.empty()==false)
                {
                    boolean result=precedence(ch,st.peek());
                    //continue
                    if(result==true)
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
    public boolean precedence(char op1, char op2)
    {
        if(op2=='$')
            return false;
       else if(op1=='$')
           return true;
       else if(op2=='/' || op2=='%' || op2=='*')
           return false;
       else if (op1=='/' || op1=='%' || op1=='*')
           return true;
       else if (op2=='+' || op2=='-')
           return false;
       else
           return true;
    }


    @Override
    public String toString() {
        return "infix=" + infix +
                ", postfix=" + postfix;
    }
}

