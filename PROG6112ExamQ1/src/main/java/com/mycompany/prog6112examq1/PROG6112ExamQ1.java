/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112examq1;

/**
 *
 * @author lab_services_student
 */
public class PROG6112ExamQ1 {

    public static void main(String[] args) {
     
        String[] year = {"YEAR 1", "YEAR 2"};
        
       
        int[][] sales = {
            {300, 150, 700},   // Year 1
            {250, 200, 600}    // Year 2
        };
        
        // Quarter for display
        String[] quarter = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        
  
        int[] totalSales = new int[year.length];
        int topIndex = 0; 
        
         int[] averageSales = new int[year.length];
        int avgIndex = 0; 
        
        int[] maximumSales = new int[year.length];
        int maxIndex = 0; 
        
        int[] minimumSales = new int[year.length];
        int minIndex = 0; 
        
    
        for (int i = 0; i < year.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            totalSales[i] = total;
            
          
            // Check for total sale
            if (totalSales[i] > totalSales[topIndex]) {
                topIndex = i;
            }
            // Check for minimum sale
            if (minimumSales[i] > minimumSales[minIndex]) {
                topIndex = i;
            }
        }
        
        System.out.println("====== PRODUCT SALES REPORT ======");
        System.out.println("--------------------------------------------------");
        System.out.println("Total sales: "  + totalSales[topIndex] );
        System.out.println("Average sales: "  + averageSales[avgIndex]);
        System.out.println("Maximum sales: " +  maximumSales[maxIndex]);
        System.out.println("Minimum sales: "  + minimumSales[minIndex]);
    }
}