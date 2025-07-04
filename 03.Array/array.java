import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        System.out.println("Array");
//        int arr[] = {10,20,30,40,50};
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
        int w =1;
        int brr[] = new int[5];
        for (int i = 0; i <brr.length ; i++) {

            System.out.print("Enter the number "+w+": ");
            brr[i]= sc.nextInt();
            w++;
        }

        System.out.print("Array is : ");
        for (int i = 0; i <brr.length ; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}

