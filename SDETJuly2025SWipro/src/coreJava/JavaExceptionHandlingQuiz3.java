package coreJava;

public class JavaExceptionHandlingQuiz3 
{
    public static void main(String[] args) 
    {   
        try
        {
            System.out.println(1); // will print output 1
            int i = 100 / 0; // ArithmeticException
            System.out.println(2); // not executed
        }
        catch (Exception e) 
        {
            System.out.println(3); // print due to exception
        }
    }
}
