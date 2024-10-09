package ArrayPractice;

public class bubbleSort
{
    public static void main(String[] args)
    {
        int a[]={6,2,4,9,3};
        int len=a.length;
        System.out.println("Unsorted array: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i ]+" ");
        }
        for(int i=0;i<len;i++)
        {
           for(int j=1;j<len-i;j++)
           {
               if(a[j-1]>a[j])
               {
                   int temp=a[j];
                   a[j]=a[j-1];
                   a[j-1]=temp;
               }
           }
        }
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i ]+" ");
        }
    }
}
