package coreJava;

public class JavaExceptionHandlingQuiz4 
{
    public static void main(String[] args) 
    {   
        try
        {
            System.out.println(1);
        }
        catch (Exception e) 
        {
            System.out.println(2);
        }
        System.out.println(3);
       
        {
            System.out.println(4);
        }
    }
}

// cannot place a statement (System.out.println(3)) between catch and finally

// finally must immediately follow try-catch block