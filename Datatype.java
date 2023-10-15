public class Datatype {
    public static void main(String[] args)
    {
        int num1;
        double num2;
        float num3;
        String firstname;
        String lastname;

        num1 = 1;
        num2 = 2.5;
        num3 = 3.6f;
        firstname = "Saimongu";
        lastname = "Marma";

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(firstname+" "+lastname);
        
        //differences
        int number1 = 1, number2 = 2;
        String name1 = "Virat";

        System.out.println(number1 + number2);
        System.out.println(name1+number1);
        System.out.println(number1 + name1 + number2);
        System.out.println(name1 + number1 + number2);
        System.out.println(number1 + number2 + name1);

        //type casting
        int num_1 = 5, num_2 = 2;
        double num_3;

        num_3 =(double)num_1/num_2;
        System.out.println(num_3);
    }
}
