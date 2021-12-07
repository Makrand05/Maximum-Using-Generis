package com.biz.genmax;

import org.junit.Assert;
import org.testng.annotations.Test;

public class GenericMaximumTest {
    @Test
    //Test Case for the Integer where max at first Position
    void given3Integer_whenMax_returnCorrectMax_case1(){
       Integer actualResult= (Integer) GenericMaximum.printMax(30,20,10);
       Integer expectedResult=30;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Integer where max at Second Position
    void given3Integer_whenMax_returnCorrectMax_case2(){
        Integer actualResult= (Integer) GenericMaximum.printMax(20,90,30,40,10);
        Integer expectedResult=40;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Integer where max at Third Position
    void given3Integer_whenMax_returnCorrectMax_case3(){
        Integer actualResult= (Integer) GenericMaximum.printMax(30,20,40);
        Integer expectedResult=40;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Float where max at first Position
    void given3Floats_whenMax_returnCorrectMax_case1(){
        Float actualResult= GenericMaximum.printMax(30.1f,20.2f,10.3f);
        Float expectedResult=30.1f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Float where max at Second Position
    void given3Floats_whenMax_returnCorrectMax_case2(){
        Float actualResult= GenericMaximum.printMax(30.1f,40.2f,10.3f);
        Float expectedResult=40.2f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Float where max at Third Position
    void given3Floats_whenMax_returnCorrectMax_case3(){
        Float actualResult= GenericMaximum.printMax(30.1f,20.2f,40.3f);
        Float expectedResult=40.3f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the String where max at first Position
    void given3String_whenMax_returnCorrectMax_case1(){
        String actualResult= GenericMaximum.printMax("abc","PQR","XYZ");
        String expectedResult="abc";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the String where max at Second Position
    void given3String_whenMax_returnCorrectMax_case2(){
        String actualResult= GenericMaximum.printMax("abc","pqr","XYZ");
        String expectedResult="pqr";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the String where max at Third Position
    void given3String_whenMax_returnCorrectMax_case3(){
        String actualResult= GenericMaximum.printMax("abc","PQR","xyz");
        String expectedResult="xyz";
        Assert.assertEquals(expectedResult,actualResult);
    }

}
