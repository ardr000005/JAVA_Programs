class call
{
    synchronized public void callering(String msg)
    {
        System.out.print("[");
        try{
            Thread.sleep(1000);
            System.out.println( msg + "]");
        }
        catch(InterruptedException e)
        {
            System.out.println("Caught by interrupted exception");
        }

    }
}
class caller implements Runnable
{
    String m;
    call ca;
    Thread th;
    caller(String msg,call c)
    {
        m = msg;
        ca = c;
        th = new Thread(this);
        th.start();
    }
    public void run()
    {
        ca.callering(m);
    }
}
class demo
{
    public static void main(String args[])
    {
        call v = new call();
        caller c1 = new caller("hello",v);
        caller c2 = new caller("aravind",v);
        caller c3 = new caller("good",v);
    }
}