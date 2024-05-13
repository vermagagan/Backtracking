public class Braktracking_array
{
    public static void printarr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
    }
    public static void changearr(int arr[], int i, int newVal)
    {
        //BASECASE
        if(i == arr.length)
        {
            printarr(arr);
            return;
        }
        arr[i] = newVal;
        changearr(arr, i+1, newVal+1);
        //System.out.println("\n"+i);
        arr[i] = arr[i] - 2;

    }
    public static void main(String args[])
    {
        int arr[] = new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
    }
}