//Implement a java program to sort given 10 numbers in ascending order

import java.util.Scanner;

class SortAsce{
    public static void main(String[] args){
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements of an array :");

        for(int i=0;i<10;i++)
        {
          a[i] = sc.nextInt();
        }
        int temp;

        for(int i=0;i<10;i++)
        { 
          for(int j=0;j<9-i;j++)
          {
             if(a[j]>a[j+1])
             {
               temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
             }
          }
        }
        System.out.println("Sorted array : ");
        for(int i = 0;i<10;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
}

