package com.biz.genmax;

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
        Integer integer= (Integer) genericMaximum.findMaximum(10, 20, 30);
        System.out.println(integer);

        //GenericMaximum genericFloatMaximum=new GenericMaximum(10.1f, 20.2f, 30.3f);
        Float aFloat= (Float) genericMaximum.findMaximum(0.1f, 20.2f, 30.3f);
        System.out.println(aFloat);

        //GenericMaximum genericStringMaximum=new GenericMaximum("ABC","PQR","XYZ");
        String string= (String) genericMaximum.findMaximum("ABC","PQR","XYZ");
        System.out.println(string);

    }

    public static <T extends Comparable> T findMaximum(T a, T b, T c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        }
        return c;

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
