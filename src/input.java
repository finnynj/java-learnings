import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);

        System.out.println("Enter Float: ");
        float myFloat = data.nextFloat();
        System.out.println("Value is: "+myFloat);

        System.out.println("Enter double: ");
        double myDouble = data.nextDouble();
        System.out.println("Value is: "+myDouble);

        System.out.println("Enter text: ");
        String mystr = data.next();
        System.out.println("Value is: "+mystr);
    }
}
