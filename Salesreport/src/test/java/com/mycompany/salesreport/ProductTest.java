/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.salesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lwazi
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of totalSales method, of class Product.
     */
    @org.junit.jupiter.api.Test
    public void testTotalSales() {
        System.out.println("totalSales");
        int[][] productSales = null;
        Product instance = new Product();
        int expResult = 0;
        int result = instance.totalSales(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of averageSales method, of class Product.
     */
    @org.junit.jupiter.api.Test
    public void testAverageSales() {
        System.out.println("averageSales");
        int[][] productSales = null;
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.averageSales(productSales);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostPopularProduct method, of class Product.
     */
    @org.junit.jupiter.api.Test
    public void testMostPopularProduct() {
        System.out.println("mostPopularProduct");
        String[] products = null;
        int[][] productSales = null;
        Product instance = new Product();
        String expResult = "";
        String result = instance.mostPopularProduct(products, productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
