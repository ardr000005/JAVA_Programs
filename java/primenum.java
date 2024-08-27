import java.util.*;
class prime 
{
    public static void main(String args[])
    {
        int i;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int v=n.nextInt();
        int f=0;
        for(i=2;i<=v;i++)
                {
                    for(int j=2;j<=v;j++)
                    {
                    if(i>j)
                    {
                        if(i%j==0)
                        {
                            f=1;
                        }
                    }
                    }
                if(f == 0)
                {
                    System.out.println(i+" ");
                }
                
                }
}}