import java.util.Scanner;

public class input_output {

    public static void main(String[] args) {

        System.out.println("Hello Java");
        int myfirst = 10+5;
        System.out.println(myfirst);

        Scanner a = new Scanner(System.in);

        System.out.println("Enter the nuimber");
        int number = a.nextInt();

        System.out.println(number);

        a.close();

    }
}
