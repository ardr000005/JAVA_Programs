import java.util.*;
import java.io.*;

class ArdException extends Exception
{
    public ArdException(String string)
    {
        super(string);
        System.out.println(string);
    }
}
class exception
{
    public static void main (String [] args)throws IOException
    {
        int n,m,c;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        try{
        if(n<18)
        {
            throw new ArdException("You are elder so cannot join");
        }
        else
        {
            System.out.println("You are welcome");
        }
    }
        catch(ArdException e)
        {
            System.out.println("It is Ard Exception by ard1");
        }

        try
        {
            System.out.println("Enter two numbers");
            m=in.nextInt();
            n=in.nextInt();
            c=m/n;
            System.out.println("result is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception has been caught");
        }
        catch(Exception e)
        {
            System.out.println("Iam a new Exception");
        }

    }
}