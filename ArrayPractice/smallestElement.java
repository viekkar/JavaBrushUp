package ArrayPractice;

public class smallestElement
{
    public static void main(String[] args) {
        int arr[]=new int[]{56,86,45,96,125,652,1,56};
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
