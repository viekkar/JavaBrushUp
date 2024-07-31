package ArrayPractice;

public class sumOfElements
{
    public static void main(String[] args)
    {
        int arr[]=new  int[]{2,65,40,32,75};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
