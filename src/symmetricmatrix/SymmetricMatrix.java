/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symmetricmatrix;

import java.util.Scanner;
public class SymmetricMatrix {

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       System.out.println("Enter the number of rows : ");
       int nrows = scn.nextInt();
       System.out.println("Enter the number of columns : ");
       int ncolums = scn.nextInt();
       int matrix[][]= new int[nrows][ncolums];
       System.out.println("Enter the elements : ");
       for(int i =0; i<nrows; i++)
       {
           for(int j =0;  j < ncolums; j++)
           {
               matrix[i][j] = scn.nextInt();
           }
       }
       
       //checking the input matrix is square matrix
       if(nrows != ncolums)
       {
           System.out.println("The given matrix is not a square matrix. so it can not be symmetric");
       }
       //checking the matrix is symmectric
       else
       {
          boolean symmetric = true;
           if(symmetric)
           {
           System.out.println("The given matrix is Symmetric");
           for(int i=0; i<nrows;i++)
       {
           for(int j=0; j<ncolums;j++)
           {
               System.out.print(matrix[i][j] + "\t");
               
           }
           System.out.println();
       } 
           }
           else
           {
               for(int i=0; i<nrows;i++)
           {
              for(int j=0; j<ncolums; j++) 
              {
                  if(matrix[i][j]!= matrix[j][i]);
                  {
                      symmetric = false;
                      System.out.println("The given matrix is not Symmetric");
                      break;
                      
                  }
       
           }
       }
       
       
      
    }
       }
    }
}
    


    
    

