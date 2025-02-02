import java.util.*;
class odd extends Thread
{
     public void run()
    {
    synchronized(this){
        try{
        Thread.sleep(1000);
        for(int i=0;i<=10;i=i+2)
        {
            System.out.print(i + " ");
        }
    
    }
    catch(InterruptedException e)
    {
        System.out.println("Excepeion caught");
    }
    }
}
    
    }
class even extends Thread
{
        public void run(){
            synchronized(this){
   try{ Thread.sleep(1000);
    for(int j=1;j<=10;j=j+2)
        {
            System.out.print(j + " ");
        }
    }
    catch(InterruptedException e)
{
    System.out.println("Excepeion caught");
}
     }
    }
}

class test
{
    public static void main(String args[]){
        even e = new even();
        odd o = new odd();
        e.start();
        o.start();
        System.out.println("Thread name"+ e.getName());
        System.out.println("Thread name"+ o.getName());
    }
}
