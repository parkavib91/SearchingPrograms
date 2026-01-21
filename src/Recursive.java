class Recursive{
public static int Search(int arr[], int l, int r,
                               int x)
    {
        if (r < l)
            return -1;

        if (arr[l] == x)
            return l;

        if (arr[r] == x)
            return r;
        return Search(arr, l + 1, r - 1, x);
    }

}
        

