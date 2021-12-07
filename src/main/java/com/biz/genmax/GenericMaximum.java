package com.biz.genmax;

public class GenericMaximum {
    public static void main(String[] args) {
        Integer intResult = findMaximum(10, 20, 30);
        System.out.println(intResult);
        Float floatResult = findMaximum(10.1f, 20.2f, 30.3f);
        System.out.println(floatResult);
        String stringResult=findMaximum("ABC","PQR","XYZ");
        System.out.println(stringResult);

    }

    public static <T extends Comparable> T findMaximum(T a, T b, T c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;

    }

}
