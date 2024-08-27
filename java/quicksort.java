import java.util.*;
import java.lang.*;
public class quicksort {
    
    public static void Quicksort(String a[],int leftend,int rightend)
    {
        if(leftend<=rightend)
        {
            int p=partition(a,leftend,rightend);
            Quicksort(a,leftend,p-1);
            Quicksort(a,p+1,rightend);


        }
        else
        {
            return;
        }
    }

    public static int partition(String a[],int leftend,int rightend)
    {
        int left=leftend;
        int right = rightend;
        char pivot=a[left];
        char temp ;
        while(left<right)
        {
            while(rightend>left && (a[left].compareTo(pivot))<=0)
            {
                left++;
            }
            while(leftend<right && (a[left].compareTo(pivot))>0)
            {
                right--;
            }
            if(left<right)
            {
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
            else
            {
                temp=a[leftend];
                a[leftend]=a[right];
                a[right]=temp;
            }
        }
        return right;
    }

    public static void display(String a[],int m){
        {
            for(String j : a)
            {
                System.out.println(j);
            }

        }
    }
        public static void main(String args[])
        {
            String[ ] a = new String[20];
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of characters");
            int n = in.nextInt();
            System.out.println("Enter the characters to be sorted");
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextLine();
            }
            Quicksort(a,0,n-1);
            display(a,n);
        }
    }
