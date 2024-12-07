import java.util.*;

class A {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println(arr[4]);
        arr[2]=120;
        arr[1]=100;
        System.out.println(Arrays.toString(arr));

    }   
}
