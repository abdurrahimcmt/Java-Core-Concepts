package com.common.generic;

import java.util.ArrayList;

public class SimpleGenericExp {
    public static void main(String[] args) {
        //This generic has type safety,avoid manual casting,compile time checking.
        //Now this arrayList only accept string value
        ArrayList<String> st = new ArrayList<>();
        st.add("Abdur ");
        st.add("Rahim");
        st.add("Miji");
        System.out.println(st.getFirst() + st.getLast());
    }
}
