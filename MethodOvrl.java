//Java program using a method overloading

class MethodOvrl{
    static int sum(int x,int y){
       return(x+y);
    }
  
    static double sum(double x,double y){
       return(x+y);
    }

    public static void main(String[] args){
       int s1 = sum(2,8);
       System.out.println(s1);
       double s2 = sum(2.8,8.7);
       System.out.println(s2);
    }
}