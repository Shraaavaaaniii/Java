//Java program to perform addition,subtraction,multipicatio and division on a 3*3 matrix

import java.util.Scanner;

class Matrix_3by3{
    public static void main(String[] args)
    {
        int[][] a= new int[3][3];
        int[][] b= new int[3][3];
        int[][] c= new int[3][3];
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter values of the first matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 a[i][j] = s.nextInt();   
            }
        }
        
        System.out.println("Enter values of the second matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 b[i][j] = s.nextInt();   
            }
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 c[i][j] = a[i][j] + b[i][j];   
            }
        }
        
        System.out.println("Addition :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 c[i][j] = a[i][j] - b[i][j];   
            }
        }
        
        System.out.println("Subtraction :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
        for(int i=0;i<3;i++)
        {   
            for(int j=0;j<3;j++)
            {  
                 c[i][j] = 0; 
                 for(int k=0;k<3;k++) 
                 {
                     c[i][j] = c[i][j] + (a[i][k] * b[k][j]); 
                 } 
            }
        }
        System.out.println("Multiplication :");
        for(int i=0;i<3;i++)
        {
           
            for(int j=0;j<3;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
        for(int i=0;i<3;i++)
        {   
            for(int j=0;j<3;j++)
            {  
                 c[i][j] = a[i][j]/b[i][j];           
            }
        }
        System.out.println("Division :");
        for(int i=0;i<3;i++)
        {
           
            for(int j=0;j<3;j++)
            {
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println("");   
        }
        
    }
}
