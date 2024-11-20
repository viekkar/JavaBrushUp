package GitPractice;

public class LagestElemnentOfArray
{
    public static void main(String[] args)
    {
        int [] arr= new int[]{10,65,78,53,19};
        int max= arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println("Largest element in the given array : "+max);


    }
}
