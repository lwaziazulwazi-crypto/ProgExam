/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author lwazi
 */
public interface IProducts {
    int totalSales(int [][] productSales);
    double averageSales(int[][] productSales);
    String mostPopularProduct(String[] products, int[][] productSales);
    
}
