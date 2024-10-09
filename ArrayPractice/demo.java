package ArrayPractice;

public class demo
{
   // input= india is my country

    public static String reversString(String str)
    {
        String rev="";
        String word[]=str.split(" ");

        for(int i=word.length-1;i>=0;i--)
        {
            rev=rev+word[i]+" ";
        }
        return rev;
    }


    public static void main(String[] args)
    {

        System.out.println(reversString("Vishnu"));

    }


}
