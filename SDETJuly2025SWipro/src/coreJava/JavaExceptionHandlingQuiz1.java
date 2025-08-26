package coreJava;

// number 1
public class JavaExceptionHandlingQuiz1 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Try Block");
        }
        catch (Exception e) 
        {
            System.out.println("Catch Block");
        }
        
        System.out.println("-----"); // this must be outside the try-catch
    }
}
