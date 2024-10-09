package ArrayPractice;

public class reverseMobileNumber
{
    public static void main(String[] args)
    {
        String str="9356707658";
        String rev="";
        System.out.println(str);
        char a[]=str.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            rev=rev+a[i];

        }
        System.out.println(rev);
    }
}
