public class LinearBinary {
   public static int search(int a[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                return i;
        }

        // return -1 if the element is not found
       
        return -1;
    } 
}                           