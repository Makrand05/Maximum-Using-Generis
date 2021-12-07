package com.biz.genmax;

public class GenericMaximum {
    public static void main(String[] args) {
       Integer max= findIntegerMaximum(10,20,30);
        System.out.println(max);

    }

    public static Integer findIntegerMaximum(Integer a, Integer b, Integer c) {
        if(a.compareTo(b) >0 && a.compareTo(c)>0){
            return  a;
        }
        else if(b.compareTo(a)>0 && b.compareTo(c)>0){
            return b;
        }
        return c;

    }
}
