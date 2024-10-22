//Java program using static method

class StaticMethod{
    static void method(){
       System.out.println("Get executed");
    }
  
    /*public static void main(String[] args){
       method(); here as the static method is called from the same class we using only method name 
    }*/
}

class Main{
    public static void main(String[] args){
       //ClassName.methodName();
       StaticMethod.method();
    }
}