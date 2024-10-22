//Implement a Java program to perform addition,subtraction,multipication and transpose on a 2*2 matrix using switch case

import java.util.Scanner;

class Switch_2by2_Matrix{
    public static void main(String[] args){
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
 
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Transpose\nEnter your choice (1/2/3/4) :");
        int choice = s.nextInt();

        switch(choice)
        {
           case 1 :
                 System.out.println("Addition :");
                 for(int i=0;i<2;i++)
                 {
                    for(int j=0;j<2;j++)
                    {
                      c[i][j] = a[i][j] + b[i][j];   
                    }
                 }
                 break;
           case 2:
                 System.out.println("Subtraction :");
                 for(int i=0;i<2;i++)
                 {
                    for(int j=0;j<2;j++)
                    {
                      c[i][j] = a[i][j] - b[i][j];   
                    }
                 }
                 break;
            case 3:
                 System.out.println("Multiplication :");
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
                 break;
            case 4:
                 System.out.println("Trnspose of first matrix :");
                 for(int i=0;i<2;i++)
                 {
                    for(int j=0;j<2;j++)
                    {
                      c[i][j] = a[j][i];  
                    }
                 }
                 break;
        }
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