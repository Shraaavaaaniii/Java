//Implement a Java program to find given number is prime or not take number as command line argument

class Prime_Number{
    public static void main(String[] args)
    {
        int count = 0;
        String s = args[0];
        int num = Integer.parseInt(s);
        
        for(int i = 2;i < num;i++)
        {
          if(num%i == 0)
          {
            count++;
            break;
          }
        }

        if(count == 0)
        {
          System.out.println(num+" is a prime number");
        }
        else
        {
          System.out.println(num+" is ot a prime number");
        }
    }
}
