public class Finding_subsets
{
    public static void findSubsets(String str, String ans, int i)
    {
        //BASE case
        if(i == str.length())
        {
            System.out.println(ans);
            return;
        }
        findSubsets(str, ans+str.charAt(i), i+1);//Recursion
        findSubsets(str, ans, i+1);//Backtracking

    }
    public static void main(String args[])
    {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
