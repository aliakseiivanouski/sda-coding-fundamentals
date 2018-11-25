package com.sda.codingfundamentals;

public class EqualsEqualsVsEqualsMethod {

    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = new String("a");
        String d = "b";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(b == d);
        System.out.println(b.equals(d));

    }
}
