package StringPrograms;

public class ReverseString
{
    public static void main(String[] args)
    {
        //Approch 1
//        String str="Welcome to java";       //using String Buffer class
//        StringBuffer sb=new StringBuffer(str);
//        sb.reverse();
//        System.out.println(sb);

        //approch 2nd
    String s="level";
    String rev= "";
    for(int i=s.length()-1;i>=0;i--)
    {
        rev= rev+ s.charAt(i);
    }
        System.out.println(rev);
    if(rev.equals(s))
    {
        System.out.println("is palindrome");
    }
    else
    {
        System.out.println("is not palindrome");
    }

        //approch 3 converting string to char array type
//        String s="welcome";
//        String rev="";
//        char a[]    =s.toCharArray();
//        for(int i=a.length-1;i>=0;i--)
//        {
//           rev=rev+ a[i];
//        }
//        System.out.println(rev);

        //Approch 4 Stringbuilder

//        StringBuilder s= new StringBuilder("selenium");
//        System.out.println("Reverse string is : "+s.reverse());
    }


}
