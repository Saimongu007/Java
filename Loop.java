import java.util.Scanner;

public class Loop {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int age;
        age = input.nextInt();

        if(age < 20)
        {
            System.out.println("Number is less than 20");
        }
        else
        {
            System.out.println("Number is greater than 20");
        }
    }
}
