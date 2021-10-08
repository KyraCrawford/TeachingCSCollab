import java.util.Scanner;

public class fibonacci {
    public static void main(String [] args){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers of the Fibonacci Sequence would you like to print? ");
        int size = sc.nextInt();
        //System.out.println(n1 + "\n" + n2);
        for (int i = 0; i < size; i++) {
            System.out.println("Number " + (i+1) + ": " + n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}