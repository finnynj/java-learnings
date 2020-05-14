import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = value.nextInt();

        if(num % 2 == 0)
            System.out.println(num + "is even");
        else
            System.out.println(num + "is Odd");
    }
}
