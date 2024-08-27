import java.util.Scanner;
class binary
{
    public static void main(String args[])
    {
    int [] arr = new int[20];
    int n,mid=0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements of the array");
    n=in.nextInt();
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    System.out.println("The elements of the array are");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i] + "");
    }
    System.out.println("");
    System.out.println("Enter the element to be searched");
    int key=in.nextInt();
    int l,u;
    boolean flag = false;
    l=0;
    u=n-1;
    while(l<=u)
    {
        mid=((l+u)/2);
        if(arr[mid]==key)
        {
            flag=true;
            break;
        }
        else if(arr[mid]<key)
        {
            l = mid+1;
        }
        else if(arr[mid]>key)
        {
            u=mid-1;
        }  
        else
        {
            System.out.println("non proper increment " );
        }
    }
    
    if(flag==true)
    {
        System.out.println("Element Found at position" +  (mid+1) );
    }
    else
    {
        System.out.println("Element not found " );
    }
    }
}