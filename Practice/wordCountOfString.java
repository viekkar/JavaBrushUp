package Practice;

public class wordCountOfString
{
    public static void main(String[] args)
    {
        String str="My name is shraddha patil";
        int count=1;
         for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
