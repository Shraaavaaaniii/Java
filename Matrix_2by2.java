//Implement a Java program to perform addition,subtraction,multipication,division and transpose on a 3*3 matrix

import java.util.Scanner;

class Matrix_2by2{
    public static void main(String[] args)
    {
        int[][] a= new int[2][2];
        int[][] b= new int[2][2];
        int[][] c= new int[2][2];
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter values of the first matrix : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 a[i][j] = s.nextInt();   
            }
        }
        
        System.out.println("Enter values of the second matrix : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 b[i][j] = s.nextInt();   
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 c[i][j] = a[i][j] + b[i][j];   
            }
        }
        
        System.out.println("Addition :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 c[i][j] = a[i][j] - b[i][j];   
            }
        }
        
        System.out.println("Subtraction :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
        for(int i=0;i<2;i++)
        {   
            for(int j=0;j<2;j++)
            {  
                 c[i][j] = 0; 
                 for(int k=0;k<2;k++) 
                 {
                     c[i][j] = c[i][j] + (a[i][k] * b[k][j]); 
                 } 
            }
        }
        System.out.println("Multiplication :");
        for(int i=0;i<2;i++)
        {
           
            for(int j=0;j<2;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
        for(int i=0;i<2;i++)
        {   
            for(int j=0;j<2;j++)
            {  
                 c[i][j] = a[i][j]/b[i][j];           
            }
        }
        System.out.println("Division :");
        for(int i=0;i<2;i++)
        {
           
            for(int j=0;j<2;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
    }
}
