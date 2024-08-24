import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int n, pos, e, op;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No. of element: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Your Array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.print("\n What task you want to perform \n Insertion[1] \n Deletion[2] \n");
        op = s.nextInt();
        if (op == 1) {
            //Insertion
            int[] b = new int[n + 1];
            System.out.print("\n Enter Position where array is to be added");
            pos = s.nextInt();
            System.out.print("\n Enter Element to be added");
            e = s.nextInt();
            for (int i = 0; i < n+1; i++) {
                if (i < pos) {
                    b[i] = a[i];
                } else if (i == pos) {
                    b[i] = e;
                } else {
                    b[i] = a[i - 1];
                }
            }
            System.out.print("YOur new array is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(b[i]);
                System.out.print(" ");
            }
        }
        if (op == 2) {
            //Deletion
            int[] b = new int[n-1];
            System.out.print("\n Enter Position to be Deleted");
            pos = s.nextInt();
            for (int i = 0; i <a.length; i++) {
                if (i < pos) {
                    b[i] = a[i];
                }
                else if (i == pos)
                    continue;
                    else {
                    b[i-1] = a[i];
                }
            }
            System.out.print("YOur new array is: ");
            for (int i = 0; i<n-1; i++){
                System.out.print(b[i]);
                System.out.print(" ");
            }
        }
    }
}
