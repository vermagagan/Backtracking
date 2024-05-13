public class Permutation
{
    public static void permutation(String str, String ans)
    {
        //BASE CASE
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);
            //--------------(FIRST ELEMENT CHANGE)----------(REST ELEMENT)
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }
    public static void main(String args[])
    {
        String str = "abc";
        permutation(str, "");
    }
}
