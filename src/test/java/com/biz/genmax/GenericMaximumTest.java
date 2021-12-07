package com.biz.genmax;

import org.junit.Assert;
import org.testng.annotations.Test;

public class GenericMaximumTest {
    @Test
    //Test Case for the Integer where max at first Position
    void given3Integer_whenMax_returnCorrectMax_case1(){
       Integer actualResult= GenericMaximum.findIntegerMaximum(30,20,10);
       Integer expectedResult=30;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Integer where max at Second Position
    void given3Integer_whenMax_returnCorrectMax_case2(){
        Integer actualResult= GenericMaximum.findIntegerMaximum(30,40,10);
        Integer expectedResult=40;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Integer where max at Third Position
    void given3Integer_whenMax_returnCorrectMax_case3(){
        Integer actualResult= GenericMaximum.findIntegerMaximum(30,20,40);
        Integer expectedResult=40;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Float where max at first Position
    void given3Floats_whenMax_returnCorrectMax_case1(){
        Float actualResult= GenericMaximum.findFloatMaximum(30.1f,20.2f,10.3f);
        Float expectedResult=30.1f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Float where max at Second Position
    void given3Floats_whenMax_returnCorrectMax_case2(){
        Float actualResult= GenericMaximum.findFloatMaximum(30.1f,40.2f,10.3f);
        Float expectedResult=40.2f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
        //Test Case for the Float where max at Third Position
    void given3Floats_whenMax_returnCorrectMax_case3(){
        Float actualResult= GenericMaximum.findFloatMaximum(30.1f,20.2f,40.3f);
        Float expectedResult=40.3f;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
