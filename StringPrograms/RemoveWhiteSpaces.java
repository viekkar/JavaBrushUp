package StringPrograms;

public class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        //Approch 1
       /* String str1="Remove White Spaces";

        str1= str1.replaceAll(" ","");

        System.out.println("String after removing all the white spaces : " + str1);*/

        // Approch 2
        String str1="Remove White Spaces";
       String str2="";
        System.out.println(str1);
        char a[]=str1.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=' ')
            {
                str2=str2+a[i];

            }
        }
        System.out.println(str2);

    }
}
// same program with for loop by parcing charArray
