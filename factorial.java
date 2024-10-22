//Implement a Java program to find factorial of a given number

import java.util.Scanner;

class factorial{
    public static void main(String[] a)
    {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number whose factorial do you want to find : ");
        int no = sc.nextInt();
        
        for(int i = no;i>0;i--)
        {
            fact = fact * i;
        }
        
        System.out.println("Factorial of "+no+" is "+fact);
    }
}
