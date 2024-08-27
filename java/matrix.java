import java.util.*;
class matrix
{
    public static void main (String args[])
    {
        int mat1[][] = new int [20][20];
        int mat2[][] = new int [20][20];
        int pro[][] = new int [20][20];
        int r1,r2,c1,c2,i,j,k,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows and colums of first matrix");
        r1=s.nextInt();
        c1=s.nextInt();
        System.out.println("Enter the rows and colums of Second matrix");
        r2=s.nextInt();
        c2=s.nextInt();
        System.out.println("Enter the elements of the first matrix");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                mat2[i][j]=s.nextInt();
            }
        }
        if(c1!=r2)
        {
            System.out.println("Addition not possible");
        }
        else
        {
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    for(k=0;k<c1;k++)
                    {
                    sum+=(mat1[i][k]*mat2[k][j]);
                    }
                    pro[i][j]=sum;
                    sum=0;
                }
            }
            System.out.println("The First Matrix is ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println("\n");
            }
            System.out.println("The Second Matrix is ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println("\n");
            }
            System.out.println("The Product Matrix is ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(pro[i][j]+" ");
                }
                System.out.println("\n");
            }
        }
    }


}
