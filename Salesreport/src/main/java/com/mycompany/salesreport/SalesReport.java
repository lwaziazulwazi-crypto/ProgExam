/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;
import java.util.*;
/**
 *
 * @author lwazi
 */
public class SalesReport {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String[] products = {"Cozy Nights Monarch","Restonic Barbados","Sealy phuket"};
     int[][] sales = new int[3][3];
     for (int i = 0; i < products.length; i++){
         for (int month = 0; month <3; month++){
             System.out.println("Enter number of sales for month" + (month + 1) + "for" + products[i] +"mattress");
             sales[i][month] = scanner.nextInt();
         }
         System.out.println();
     }
    
     Product productReport = new Product();
       int total = productReport.totalSales(sales);
       int average = (int) Math.round(productReport.averageSales(sales));
        String mostPopular = productReport.mostPopularProduct(products, sales);
        System.out.println("TOTAL PRODUCT:" + total);
        System.out.println("AVERAGE PRODUCT:" + average);
        System.out.println("MOST POPULAR PRODUCT:" + mostPopular);


        }
    }

