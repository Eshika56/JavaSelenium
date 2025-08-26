package coreJava;

public class JavaExceptionHandlingQuiz5 
{
    public static void main(String[] args) 
    {   
        System.out.println(1); // print
        try
        {
            System.out.println(2); // print
            int i = Integer.parseInt("ABC"); // throws NumberFormatException
            System.out.println(3); // not print due to exception
        }
        catch (Exception e) 
        {
            System.out.println(4); // print
        }
        finally
        {
            System.out.println(5); // print
        }
        System.out.println(6); // print
    }
}
