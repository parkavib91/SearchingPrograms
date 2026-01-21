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
class Binary{    
public static int search(int a[],int l,int r,int x){
    while(l <= r){
        int m = (l + r)/2;
        if (a[m] == x){
         return m;
            }
            else if (a[m] > x) {
                r = m - 1;
                
            }
            else {
                l = m + 1;
            }
        }

        // No Element Found
        return -1;
    }
}
class Recursive{
    public static int search(int arr[], int l, int r,
                               int x){
     if (r < l)
            return -1;

        if (arr[l] == x)
            return l;

        if (arr[r] == x)
            return r;
         return search(arr, l + 1, r - 1, x);
                               }
                            }
                            