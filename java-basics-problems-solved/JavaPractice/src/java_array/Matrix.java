package java_array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/**
 *
 * @author S.M Sahriar Faisal
 * @since 20/07/2020
 */
public class Matrix {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] firstMatrix = new int[3][3];
        int[][] secondMatrix = new int[3][3];
      
        //First Matrix.
        System.out.println("Please Enter First Matrix : ");
        //Getting input for First matrix;
        for(int row = 0; row< 3; row++)
        {
          for(int col = 0; col< 3; col++)
          {
              System.out.printf("First Matrix[%d][%d] = ",row, col);
              firstMatrix[row][col] = input.nextInt();
          }
        }
        
        //Printing First matrix;
        System.out.println("First Matrix = ");
        for(int row = 0; row< 3; row++)
        {
          for(int col = 0; col< 3; col++)
          {
              System.out.print(" "+ firstMatrix[row][col]);
          }
          System.out.println();
        }
        
        //Print The Principal Diagonal
        System.out.println("Principal Diagonal = "); 
        for (int row = 0; row < 3; row++) 
        { 
            for (int col = 0; col < 3; col++) 
            { 
                // Condition for principal diagonal 
                if (row == 0 && col == 0) 
                { 
                    System.out.println(firstMatrix[0][0]);
                }
                else if(row == 1 && col == 1)
                {
                    System.out.println(" " + firstMatrix[1][1]);
                }
                else if(row == 2 && col == 2)
                {
                    System.out.println(" " + " " + firstMatrix[2][2]);
                }
            } 
        }
        
        //Print The Secondary Diagonal
        System.out.println("Secondary Diagonal = "); 
        for (int row = 0; row < 3; row++) 
        { 
            for (int col = 0; col < 3; col++) 
            { 
                // Condition for Secondary diagonal 
                if (((row + col) == 0) && ((3-1) == 2))
                {
                    System.out.println(" " + " " + firstMatrix[0][2]);
                }
                else if(((row + col) == 2) && (row==1) &&(col==1))
                {
                    System.out.println(" " + firstMatrix[1][1]);
                }
                else if(((row + col) == 2) && ((row==2) && (col==0)))
                {
                    System.out.println(firstMatrix[2][0]);
                }
            } 
        } 
        
        // Finding sum of boundary elements 
        long sum = 0; 
        for (int row = 0; row < 3; row++) 
        { 
            for (int col = 0; col < 3; col++) 
            { 
                if (row == 0) 
                    sum += firstMatrix[row][col]; 
                else if (row == 3 - 1) 
                    sum += firstMatrix[row][col]; 
                else if (col == 0) 
                    sum += firstMatrix[row][col]; 
                else if (col == 3 - 1) 
                    sum += firstMatrix[row][col]; 
            } 
        }
        System.out.println("Summation of boundary element = " + sum);
        
        //Second Matrix.
        System.out.println("Please Enter Second Matrix : ");
        //Getting input for Second matrix;
        for(int row = 0; row< 3; row++)
        {
          for(int col = 0; col< 3; col++)
          {
              System.out.printf("Second Matrix[%d][%d] = ",row, col);
              secondMatrix[row][col] = input.nextInt();
          }
        }
        
        //Printing Second matrix;
        System.out.println("Second Matrix = ");
        for(int row = 0; row< 3; row++)
        {
          for(int col = 0; col< 3; col++)
          {
              System.out.print(" "+ secondMatrix[row][col]);
          }
          System.out.println();
        }
        
        // Adding Two matrices
        int[][] matrixSum = new int[3][3];
        for(int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrixSum[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
            }
        }
        
       // Displaying the result
        System.out.println("Sum of two matrices is = ");
        for(int[] row : matrixSum) 
        {
            for (int column : row) 
            {
                System.out.print(column + "   ");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
    }
    
}
