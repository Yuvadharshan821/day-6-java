import java.util.*;

class A
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String arr[] = new String[a];
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < a; i++) {
            if (i == a - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
