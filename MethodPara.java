//Java program using a parameterised methods

import java.util.Scanner;

class MethodPara{
    static void display(String fname,int roll_no){
        System.out.println(fname+" Patil "+roll_no);     
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your roll number : ");
        int roll = sc.nextInt() ;      
        display(name,roll);
    }
}