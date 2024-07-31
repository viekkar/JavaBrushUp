package StringPractice;

public class countOfOccurance
{
    public static void main(String[] args)
    {
        String str="madam";
        int count=0;
        int len=str.length();
        char a[]=str.toCharArray();
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(a[i]==a[j])
                {
                       count++;
                }
            }
            System.out.print(a[i]+"="+count+" ");
        }

        count=0;
    }
}
