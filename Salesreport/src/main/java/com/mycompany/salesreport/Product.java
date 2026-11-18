/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author lwazi
 */
public class Product implements IProducts {

    @Override
    public int totalSales(int[][] productSales) {
        int total = 0;
        for (int i = 0; i < productSales.length; i++){
         for (int j = 0; j < productSales[i].length; j++){
            total += productSales[i][j];
        }
        }
        return total;
    }

    @Override
    public double averageSales(int[][] productSales) {
        int total = totalSales(productSales);
        int count = 0;
        for (int i = 0; i < productSales.length; i++){
            count += productSales[i].length;
        }
        return (double) total /count;
    }

    @Override
    public String mostPopularProduct(String[] products, int[][] productSales) {
        int highestSales = productSales[0][0];
        String popularProduct = products[0];
        for (int i = 0; i < productSales.length; i++){
            for (int j = 0; j < productSales[i].length; j++){
                int highestSale = 0;
                if (productSales[i][j] > highestSale){
                    highestSale = productSales[i][j];
                    popularProduct = products[i];
                }
            }
        }
    return popularProduct + (" + highestSale + ");
}
}
