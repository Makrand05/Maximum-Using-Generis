package com.biz.genmax;

import java.util.Arrays;

public class GenericMaximum <T extends Comparable>  {

    T a,b,c;

    GenericMaximum(){};
    public GenericMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        GenericMaximum genericMaximum=new GenericMaximum();
        Integer integer= (Integer) genericMaximum.printMax(100, 120, 30,50,80,100);
        System.out.println(integer);

        //GenericMaximum genericFloatMaximum=new GenericMaximum(10.1f, 20.2f, 30.3f);
        Float aFloat= (Float) genericMaximum.printMax(10.1f, 20.2f, 46.0f,17.6f);
        System.out.println(aFloat);

        //GenericMaximum genericStringMaximum=new GenericMaximum("ABC","PQR","XYZ");
        String string= (String) genericMaximum.printMax("ABC","PQR","XYZ","abc","aBC","KMA");
        System.out.println(string);

    }

    public static <T extends Comparable> T printMax(T... a) {
        Arrays.sort(a);
        return a[a.length-1];

    }

    @Override
    public String toString() {
        return "GenericMaximum{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
