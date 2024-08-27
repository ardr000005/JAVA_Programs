import java.util.*;
class link
{
    public static void main (String args[])
    {
        LinkedList<Integer> ob = new LinkedList<Integer>();
        int a,b,p;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("********Menu********");
            System.out.println("1. Inser an element into the list \n 2. Delete an element from front \n 3. Delete an element from particular position \n 4. Delete an element from rear \n 5. Display \n 6. Exit ");
            System.out.println("Enter your choice");
            a=in.nextInt();
            switch(a)
            {
                case 1 : System.out.println("Enter the element to be inserted");
                         b=in.nextInt();
                         ob.add(b);
                         System.out.println("Element inserted");
                         break;
                case 2 : try
                {
                    if(ob.isEmpty())
                    {
                        System.out.println("List is empty");
                    }
                    else
                    {
                        ob.removeFirst();
                        System.out.println("element removed");
                    }
                }
                catch(NoSuchElementException e)
                {
                    System.out.println("element not exists");
                }
                break;
                case 3 : try{
                    if(ob.isEmpty())
                    {
                        System.out.println("List is empty");
                    }
                    else
                    {
                        System.out.println("Enter the position to br removed");
                        p=in.nextInt();
                        p=p-1;
                        ob.remove(p);
                        System.out.println("element removed");
                    }
                }
                catch(NoSuchElementException e)
                {
                    System.out.println("element not exists");
                }
                catch(IndexOutOfBoundsException e)
                {
                    System.out.println("position not exists");
                }
                break;
                case 4 : try{
                    if(ob.isEmpty())
                    {
                        System.out.println("List is empty");
                    }
                    else
                    {
                        ob.removeLast();
                        System.out.println("element removed");
                    }
                }
                catch(NoSuchElementException e)
                {
                    System.out.println("element not exists");
                }
                break;
                case 5 : 
                         Iterator<Integer> i = ob.iterator();
                         try{
                         while(i.hasNext())
                         {
                            System.out.print(i.next() + " ");
                         }
                         System.out.println(" ");
                        }
                        catch(NoSuchElementException e)
                        {
                             System.out.println("element not exists");
                        }
                        break;
                case 6 :
                {
                    System.out.println("Exiting operations \n THANK YOU");
                    System.exit(0);
                }
                break;
            }
        }
    }
}