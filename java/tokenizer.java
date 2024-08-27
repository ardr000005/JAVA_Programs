import java.util.*;
class Tokenizer
{
    public static void main(String args[])
    {
        int sum=0;
        String c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string ");
        String ch = in.nextLine();
        StringTokenizer st = new StringTokenizer(ch,"+");
        while(st.hasMoreTokens())
        {
            c = st.nextToken(); 
            sum+=Integer.parseInt(c);
            System.out.print(c);
        }
        System.out.println("Sum is =" + sum);
    }
}