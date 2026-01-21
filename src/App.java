import java.util.Scanner;

public class App {
    public static void main(String[] args) {
          ExecuteProgram();  
    }
    private static void ExecuteProgram(){
        PrintDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                LinearBinary();
                break;
        
            case 2:
                Binary();
                break;

            case 3 :
                Recursive();
                break;
                   
            default:
                System.out.println("Enter the correct choice");
                break;
        }
        scanner.close();
    }

    private static void PrintDetails(){
        System.out.println("1. Linear Search");
        System.out.println("2. Binary search");
        System.out.println("3. Recursively Linear search");
    }

    private static void LinearBinary(){
         System.out.println("Enter your choice for Searching Programs"); 
         int[] a = { 3, 4, 1, 7, 5 };
        int n = a.length;
        int x = 4;
        LinearBinary linearBinary = new LinearBinary();
        int index = linearBinary.search(a, n, x);
        
      	if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at index: " + index);
    }

    private static void Binary(){
        int a[] = { 2, 3, 4, 10, 40 };
        int n = a.length;
        int x = 10;
        Binary b = new Binary();
        int res = b.search(a, 0, n - 1, x);

        System.out.println("Element to be searched is : "
                           + x);

        if (res == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println(
                "Element is present at index: " + res);

    }

    private static void Recursive(){
         int x = 3;
         int arr[] = new int[] { 25, 60, 18, 3, 10 };
         int index
        = Recursive.Search(arr, 0, arr.length - 1, x);
         if (index != -1){
         if (index != -1)

            System.out.println("Element " + x
                               + " is present at index "
                               + index);
        else

            System.out.println("Element " + x
                               + " is not present");
    }
}
}   