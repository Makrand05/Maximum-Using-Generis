package com.biz.genmax;

public class GenericMaximum {
    public static void main(String[] args) {
        Integer intResult = findIntegerMaximum(10, 20, 30);
        System.out.println(intResult);
        Float floatResult = findFloatMaximum(10.1f, 20.2f, 30.3f);
        System.out.println(floatResult);

    }

    public static Integer findIntegerMaximum(Integer a, Integer b, Integer c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;

    }

    public static Float findFloatMaximum(Float a, Float b, Float c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;

    }
    
}
