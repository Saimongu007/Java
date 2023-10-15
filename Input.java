import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int age;
        age = myinput.nextInt();

        System.out.println("Number is = " + age);

        // input character
        System.out.print("Enter the character");
        char c;
        c = myinput.next().charAt(0);

        System.out.println("Character = " + c);
    }

}
