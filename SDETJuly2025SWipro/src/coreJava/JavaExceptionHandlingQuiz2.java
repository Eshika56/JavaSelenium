package coreJava;

public class JavaExceptionHandlingQuiz2 { 

    public static void main(String[] args) 
    {
        int i = 1;
        try
        {
            i++; // i becomes 2
        }
        catch (Exception e) 
        {
            i++; // not executed
        }
        finally
        {
            i++; // i becomes 3
        }
        System.out.println(i); // print output 3
    }
}