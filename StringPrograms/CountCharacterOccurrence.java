package StringPrograms;

public class CountCharacterOccurrence
{
    public static void main(String[] args)
    {
        String s="programming";
         int count=0;
         char a[];
         a=s.toCharArray();

         int len=a.length;
         for(int i=0;i<len;i++)
         {
             for(int j=0;j<len;j++)
             {
                 if(a[i]==a[j])
                 {
                     count++;

                 }
             }
             System.out.print(a[i]+""+count);
             count=0;
         }




    }
}
