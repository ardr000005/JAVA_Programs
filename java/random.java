import java.util.*;
class odd implements Runnable
{
    int m;
    public odd(int n)
    {
        m = n;
    }
    public void run()
    {
        System.out.println("This is odd" + " Cube = "+(m*m*m) );
    }
    
}
class even implements Runnable
{
    int m1;
    public even(int n)
    {
        m1 = n;
    }
    public void run()
    {
        System.out.println("This is even"+ " Square = "+(m1*m1));
    }

}
class generator implements Runnable
{
    Random r;
    int n; 
    even e;
    odd o;
    public Thread th;
    Thread th1,th2;
    public generator()
    {
        synchronized (this){
        r=new Random();
        try {
            Thread.sleep(1000);
        }
        
        catch(InterruptedException e)
        {
            System.out.println("Exception inera has caught");
        }
        n=r.nextInt(20);
        System.out.println("This is the random number = " + n);
        th = new Thread(this);
        th.start();
    }
}
    public void run()
    {
        if((n%2)==0)
        {
        synchronized (this) {
            e=new even(n);
            th1 = new Thread(e);
            th1.start();
        }
    }
        else
        {
            synchronized (this){
            o=new odd(n);
            th2 = new Thread(o);
            th2.start();
        }
    }

    }

}
class Rest
{
    public static void main(String args[])
    {
        generator g = new generator();
        generator g1 = new generator();
        generator g2 = new generator();
        generator g3 = new generator();

        try{
        g.th.join();
        g1.th.join();
        g2.th.join();
        g3.th.join();
        }
        catch(InterruptedException e){
        System.out.println("Exception has caught");
        }
        catch(Exception e)
        {
            System.out.println("unknown excption caught");
        }
    }
}
