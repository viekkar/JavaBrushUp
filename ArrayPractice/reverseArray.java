package ArrayPractice;

public class reverseArray
{
    public static void main(String[] args)
    {
        int arr[]=new int[]{10,20,30,40,50};

        System.out.println("Given Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Array: ");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
