package com.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.opentest4j.AssertionFailedError;

public class EmpTest {
    EmpData obj = null;

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("Before all the test cases");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("After all the test cases");
    }

    @BeforeEach
    public void setUp()
    {
        System.out.println("before test method");

        obj = new EmpData();
    }

    @AfterEach
    public void setDown()
    {
        System.out.println("after test method");

        obj = null;
    }

    @Test
    public void testEmpData()
    {
        System.out.println("empdata test");

    }

    @Test
    public void testEmpData1()
    {
        System.out.println("empdata1 test");
        //assertEquals(5, obj.empData().size());
        assertFalse(obj.empData().contains(10));
    }

}




















