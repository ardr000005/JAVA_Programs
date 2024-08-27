class tuntu extends Thread
{
    public void run()
    {
        System.out.println("Thread is printing....");
    }
}
class monu 
{
    public static void main(String [] args)
    {
        tuntu t = new tuntu();
        System.out.println(t.getName());
        t.setName("tuntu Thread");
        System.out.println(t.getName());
        t.start();
    }
}