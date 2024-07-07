package dsa.stackexample5;

import java.util.ArrayList;
import java.util.List;

public class UseStack {
    public static void main(String[] args) {
        List<Integer> st=new ArrayList<>();
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println(st.get(0));
        System.out.println(st.get(1));
        System.out.println(st.get(2));
    }
}
