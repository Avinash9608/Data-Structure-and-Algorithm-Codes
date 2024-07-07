package dsa.expression2;

import java.util.Stack;

public class Prefix {
    private String prefix;

    public Prefix(String prefix)
    {
        this.prefix = prefix;
    }
    public float evaluate()
    {
        //logic
        Stack<Float> st=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--)
        {
            char ch=prefix.charAt(i);
            if(isOperand(ch)==true)
            {
                st.push((float)(ch-48));
            }else {
                float op1=st.pop();
                float op2=st.pop();
                float res=calculate(op1, op2, ch);
                st.push(res);
            }
        }
        return st.pop();
    }
    public boolean isOperand(char ch)
    {
        if(ch>=48 && ch<=57)
        return true;
        return false;
    }
    public float calculate(float op1, float op2, char op)
    {
        //logic
        switch (op)
        {
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '/':
                return op1/op2;
            case '%':
                return op1%op2;
            case '$':
                return (float) (Math.pow(op1,op2));
            default:
                return 0.0f;
        }

    }
}
