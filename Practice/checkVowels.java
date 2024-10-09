package Practice;

public class checkVowels
{
    public static void main(String[] args) {
        String str = "welcome";
        Vowelcheck(str);
    }
        public static void Vowelcheck(String str)
        {
           str= str.toLowerCase();
            String vowels="aeiou";

            System.out.println("vowels in the string \""+str+"\" :");

            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);

                if (vowels.indexOf(ch)!= -1)
                {
                    System.out.print(ch+ " ");

                }
            }
        }



    }

